package org.ryanmoussouni.bookfinder;

public interface BookFinder {
    List<Book> find(QueryParameters params);
}
