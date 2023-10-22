package org.ryanmoussouni.bookfinder;

import lombok.AllArgsConstructor;
import org.ryanmoussouni.bookfinder.domain.Book;
import org.ryanmoussouni.bookfinder.domain.googlebooks.Volume;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class GoogleBookApiAdapter implements BookFinder {
    private VolumesFetcher googleApiClient;

    @Override
    public List<Book> findBookByTitle(String title) throws BookFindingException {
        try {
            var volumes = googleApiClient.performListVolumesRequest();
            return volumes.getItems()
                    .stream()
                    .map(this::mapVolumeToBook)
                    .collect(Collectors.toList());
        } catch (BookFetchingException e) {
            e.printStackTrace();
            var message = "A book could not be found";
            throw new BookFindingException(message, e);
        }
    }

    private Book mapVolumeToBook(Volume volume) {
        return Book.builder()
                .title(volume.getVolumeInfo().getTitle())
                .description(volume.getVolumeInfo().getDescription())
                .authors(volume.getVolumeInfo().getAuthors())
                .build();
    }
}
