package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageLinks{

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("smallThumbnail")
	private String smallThumbnail;

	public String getThumbnail(){
		return thumbnail;
	}

	public String getSmallThumbnail(){
		return smallThumbnail;
	}
}