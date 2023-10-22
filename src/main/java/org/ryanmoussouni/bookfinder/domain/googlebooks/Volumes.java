package org.ryanmoussouni.bookfinder.domain.googlebooks;

import java.util.List;

public class Volumes {
    private String kind;
    private Integer totalItems;
    private List<Volume> items;

    public String getKind() {
        return kind;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public List<Volume> getItems() {
        return items;
    }
}
