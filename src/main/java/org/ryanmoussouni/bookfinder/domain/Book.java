package org.ryanmoussouni.bookfinder.domain;

import lombok.Builder;

import java.util.Date;
import java.util.List;

@Builder
public class Book {
    private String title;
    private List<String> authors;
    private Date publicationDate;
    private String ISBN;
    private String description;
}
