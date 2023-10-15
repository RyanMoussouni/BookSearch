package org.ryanmoussouni.bookfinder.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReadingModes{

	@JsonProperty("image")
	private boolean image;

	@JsonProperty("text")
	private boolean text;

	public boolean isImage(){
		return image;
	}

	public boolean isText(){
		return text;
	}
}