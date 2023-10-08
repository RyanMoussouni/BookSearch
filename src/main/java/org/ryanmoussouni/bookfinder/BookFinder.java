package org.ryanmoussouni.bookfinder;

import java.util.List;

public interface BookFinder {
    List<Book> find(QueryParameters params);
}
