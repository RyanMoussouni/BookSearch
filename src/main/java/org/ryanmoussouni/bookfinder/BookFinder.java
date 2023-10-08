package org.ryanmoussouni.bookfinder;

import org.ryanmoussouni.bookfinder.domain.Book;

import java.util.List;

public interface BookFinder {
    List<Book> find(QueryParameters params);
}
