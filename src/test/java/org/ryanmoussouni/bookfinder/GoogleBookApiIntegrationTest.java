package org.ryanmoussouni.bookfinder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ryanmoussouni.bookfinder.domain.googlebooks.Volumes;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBookApiIntegrationTest {
    public static final String GOOGLE_BOOK_API_URI = "https://www.googleapis.com/books/v1/volumes";
    public static final String PRICE_AND_PREJUDICE_VOLUME_ID = "s1gVAAAAYAAJ";
    private HttpClient httpClient;

    @BeforeEach
    void setUp() {
        httpClient = HttpClient.newBuilder()
                .build();
    }

    @Test
    void get_volumeById_returnsTheVolume() {
        var expected = HttpStatus.OK;
        HttpStatus actual = null;
        var resourcePath = String.format("%s/%s", GOOGLE_BOOK_API_URI, PRICE_AND_PREJUDICE_VOLUME_ID);
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

    @Test
    void search_volumeByTitle_returnsSomething() {
        var expected = HttpStatus.OK;
        HttpStatus actual = null;
        var titleQuery = "intitle:the+old+man+and+the+sea";
        var uri = String.format("%s?q=%s&key=%s", GOOGLE_BOOK_API_URI, titleQuery, GOOGLE_BOOK_API_KEY);
        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();

        try {
            var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            actual = HttpStatus.valueOf(response.statusCode());
        } catch (IOException | InterruptedException ie) {
            Assertions.fail("Error sending the request");
        }

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void search_volumeByTitle_returnsAListOfVolumes() {
        var titleQuery = "intitle:the+old+man+and+the+sea";
        var uri = String.format("%s?q=%s&key=%s", GOOGLE_BOOK_API_URI, titleQuery, GOOGLE_BOOK_API_KEY);
        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();

        try {
            var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            var objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            var volumes = objectMapper.readValue(response.body(), Volumes.class);
        } catch (IOException | InterruptedException ie) {
            ie.printStackTrace();
            Assertions.fail();
        }
    }
}
