package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageLinks{

	@JsonProperty("small")
	private String small;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("large")
	private String large;

	@JsonProperty("extraLarge")
	private String extraLarge;

	@JsonProperty("smallThumbnail")
	private String smallThumbnail;

	@JsonProperty("medium")
	private String medium;

	public String getSmall(){
		return small;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public String getLarge(){
		return large;
	}

	public String getExtraLarge(){
		return extraLarge;
	}

	public String getSmallThumbnail(){
		return smallThumbnail;
	}

	public String getMedium(){
		return medium;
	}
}