package org.ryanmoussouni.bookfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBookApiIntegrationTest {
    public static final String GOOGLE_BOOK_API_URI = "https://www.googleapis.com/books/v1/volumes/";
    private HttpClient httpClient;

    @BeforeEach
    void setUp() {
        httpClient = HttpClient.newBuilder()
                .build();
    }

    @Test
    void search_volumeById_returnsTheVolume() {
        var expected = HttpStatus.OK;
        HttpStatus actual = null;
        var resourcePath = String.format("%s%s", GOOGLE_BOOK_API_URI, "s1gVAAAAYAAJ");
        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(resourcePath))
                .GET()
                .build();

        try {
            var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            actual = HttpStatus.valueOf(response.statusCode());
        } catch (IOException | InterruptedException ie){
            Assertions.fail("Error sending the request");
        }

        Assertions.assertEquals(actual, expected);
    }
}
