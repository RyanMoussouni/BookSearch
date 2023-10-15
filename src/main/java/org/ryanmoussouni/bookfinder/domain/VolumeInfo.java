package org.ryanmoussouni.bookfinder.domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VolumeInfo{

	@JsonProperty("industryIdentifiers")
	private List<IndustryIdentifiersItem> industryIdentifiers;

	@JsonProperty("pageCount")
	private int pageCount;

	@JsonProperty("printType")
	private String printType;

	@JsonProperty("readingModes")
	private ReadingModes readingModes;

	@JsonProperty("previewLink")
	private String previewLink;

	@JsonProperty("canonicalVolumeLink")
	private String canonicalVolumeLink;

	@JsonProperty("language")
	private String language;

	@JsonProperty("title")
	private String title;

	@JsonProperty("imageLinks")
	private ImageLinks imageLinks;

	@JsonProperty("averageRating")
	private int averageRating;

	@JsonProperty("panelizationSummary")
	private PanelizationSummary panelizationSummary;

	@JsonProperty("publisher")
	private String publisher;

	@JsonProperty("ratingsCount")
	private int ratingsCount;

	@JsonProperty("publishedDate")
	private String publishedDate;

	@JsonProperty("maturityRating")
	private String maturityRating;

	@JsonProperty("allowAnonLogging")
	private boolean allowAnonLogging;

	@JsonProperty("contentVersion")
	private String contentVersion;

	@JsonProperty("authors")
	private List<String> authors;

	@JsonProperty("infoLink")
	private String infoLink;

	public List<IndustryIdentifiersItem> getIndustryIdentifiers(){
		return industryIdentifiers;
	}

	public int getPageCount(){
		return pageCount;
	}

	public String getPrintType(){
		return printType;
	}

	public ReadingModes getReadingModes(){
		return readingModes;
	}

	public String getPreviewLink(){
		return previewLink;
	}

	public String getCanonicalVolumeLink(){
		return canonicalVolumeLink;
	}

	public String getLanguage(){
		return language;
	}

	public String getTitle(){
		return title;
	}

	public ImageLinks getImageLinks(){
		return imageLinks;
	}

	public int getAverageRating(){
		return averageRating;
	}

	public PanelizationSummary getPanelizationSummary(){
		return panelizationSummary;
	}

	public String getPublisher(){
		return publisher;
	}

	public int getRatingsCount(){
		return ratingsCount;
	}

	public String getPublishedDate(){
		return publishedDate;
	}

	public String getMaturityRating(){
		return maturityRating;
	}

	public boolean isAllowAnonLogging(){
		return allowAnonLogging;
	}

	public String getContentVersion(){
		return contentVersion;
	}

	public List<String> getAuthors(){
		return authors;
	}

	public String getInfoLink(){
		return infoLink;
	}
}