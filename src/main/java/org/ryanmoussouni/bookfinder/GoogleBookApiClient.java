package org.ryanmoussouni.bookfinder;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ryanmoussouni.bookfinder.domain.googlebooks.Volumes;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class GoogleBookApiClient implements VolumesFetcher {
    public static final String GOOGLE_BOOK_API_URI = "https://www.googleapis.com/books/v1/volumes";
    private HttpClient httpClient;

    public GoogleBookApiClient() {
        this.httpClient = HttpClient.newBuilder()
                .build();
    }

    @Override
    public Volumes performListVolumesRequest() throws BookFetchingException {
        var titleQuery = "intitle:the+old+man+and+the+sea";
        var uri = String.format("%s?q=%s&key=%s", GOOGLE_BOOK_API_URI, titleQuery, GOOGLE_BOOK_API_KEY);
        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();

        try {
            var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            var objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.body(), Volumes.class);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            var message = "An error occured while sending the request to the API, or parsing the response\n";
            throw new BookFetchingException(e, message);
        }
    }
}
