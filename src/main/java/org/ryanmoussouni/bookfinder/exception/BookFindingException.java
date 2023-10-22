package org.ryanmoussouni.bookfinder.exception;

public class BookFindingException extends Throwable {
    public BookFindingException(String message, BookFetchingException e) {
        super(message, e);
    }
}
