package org.ryanmoussouni.bookfinder;

import org.ryanmoussouni.bookfinder.domain.Book;
import org.ryanmoussouni.bookfinder.exception.BookFindingException;

import java.util.List;

public interface BookFinder {
    List<Book> findBookByTitle(String title) throws BookFindingException;
}
