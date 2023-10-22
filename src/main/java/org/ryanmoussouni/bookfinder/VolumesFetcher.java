package org.ryanmoussouni.bookfinder;

import org.ryanmoussouni.bookfinder.domain.googlebooks.Volumes;

public interface VolumesFetcher {
    Volumes performListVolumesRequest() throws BookFetchingException;
}
