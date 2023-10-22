package org.ryanmoussouni.bookfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ryanmoussouni.bookfinder.domain.googlebooks.Volume;
import org.ryanmoussouni.bookfinder.domain.googlebooks.VolumeInfo;
import org.ryanmoussouni.bookfinder.domain.googlebooks.Volumes;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GoogleBookApiAdapterTest {

    @Test
    void findBookByTitle_fetcherProvidesAListOfVolumes_returnsAListOfBooks() throws BookFetchingException {
        var fetcherMock = mock(VolumesFetcher.class);
        when(fetcherMock.performListVolumesRequest())
                .thenReturn(createVolumeListFixture());
        var adapter = new GoogleBookApiAdapter(fetcherMock);

        try {
            var books = adapter.findBookByTitle("Duplantis, the making of a champion");
        } catch (BookFindingException e) {
            Assertions.fail();
        }
    }

    private Volumes createVolumeListFixture() {
        var duplantis1 = Volume.builder()
                .volumeInfo(
                        VolumeInfo.builder()
                                .title("Duplantis, the making of a champion")
                                .authors(List.of("Bobby Brown",
                                        "Armand Duplantis"))
                                .description("Good description")
                                .build()
                ).build();

        var duplantis2 = Volume.builder()
                .volumeInfo(
                        VolumeInfo.builder()
                                .title("Duplantis, the making of a champion")
                                .authors(List.of("Estelle Spizer",
                                        "Armand Duplantis"))
                                .description("Good description 2")
                                .build()
                ).build();
        var volumes = List.of(
                duplantis1,
                duplantis2
        );

        return new Volumes("volumes", 2, volumes);
    }
}