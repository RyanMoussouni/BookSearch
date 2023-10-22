package org.ryanmoussouni.bookfinder;

import org.ryanmoussouni.bookfinder.domain.googlebooks.Volumes;
import org.ryanmoussouni.bookfinder.exception.BookFetchingException;

public interface VolumesFetcher {
    Volumes performListVolumesRequest() throws BookFetchingException;
}
