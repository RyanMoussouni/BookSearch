package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dimensions{

	@JsonProperty("thickness")
	private String thickness;

	@JsonProperty("width")
	private String width;

	@JsonProperty("height")
	private String height;

	public String getThickness(){
		return thickness;
	}

	public String getWidth(){
		return width;
	}

	public String getHeight(){
		return height;
	}
}