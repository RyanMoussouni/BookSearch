package org.ryanmoussouni.bookfinder;

public class BookFindingException extends Throwable {
    public BookFindingException(String message, BookFetchingException e) {
        super(message, e);
    }
}
