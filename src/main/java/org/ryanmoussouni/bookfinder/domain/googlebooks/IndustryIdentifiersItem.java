package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class IndustryIdentifiersItem{

	@JsonProperty("identifier")
	private String identifier;

	@JsonProperty("type")
	private String type;

	public String getIdentifier(){
		return identifier;
	}

	public String getType(){
		return type;
	}
}