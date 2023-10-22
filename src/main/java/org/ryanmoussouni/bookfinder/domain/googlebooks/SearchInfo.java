package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class SearchInfo{

	@JsonProperty("textSnippet")
	private String textSnippet;

	public String getTextSnippet(){
		return textSnippet;
	}
}