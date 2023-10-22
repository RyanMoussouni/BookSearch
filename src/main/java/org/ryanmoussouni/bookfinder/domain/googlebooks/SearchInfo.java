package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchInfo{

	@JsonProperty("textSnippet")
	private String textSnippet;

	public String getTextSnippet(){
		return textSnippet;
	}
}