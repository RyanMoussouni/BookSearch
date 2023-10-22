package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
@JsonIgnoreProperties
public class VolumeInfo {

    @JsonProperty("industryIdentifiers")
    private List<IndustryIdentifiersItem> industryIdentifiers;

    @JsonProperty("pageCount")
    private String pageCount;

    @JsonProperty("printType")
    private String printType;

    @JsonProperty("previewLink")
    private String previewLink;

    @JsonProperty("canonicalVolumeLink")
    private String canonicalVolumeLink;

    @JsonProperty("description")
    private String description;

    @JsonProperty("language")
    private String language;

    @JsonProperty("title")
    private String title;

    @JsonProperty("imageLinks")
    private ImageLinks imageLinks;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("averageRating")
    private String averageRating;

    @JsonProperty("mainCategory")
    private String mainCategory;

    @JsonProperty("publisher")
    private String publisher;

    @JsonProperty("ratingsCount")
    private String ratingsCount;

    @JsonProperty("publishedDate")
    private String publishedDate;

    @JsonProperty("categories")
    private List<String> categories;

    @JsonProperty("contentVersion")
    private String contentVersion;

    @JsonProperty("authors")
    private List<String> authors;

    @JsonProperty("dimensions")
    private Dimensions dimensions;

    @JsonProperty("infoLink")
    private String infoLink;

    public List<IndustryIdentifiersItem> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public String getPageCount() {
        return pageCount;
    }

    public String getPrintType() {
        return printType;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getTitle() {
        return title;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getRatingsCount() {
        return ratingsCount;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getInfoLink() {
        return infoLink;
    }
}