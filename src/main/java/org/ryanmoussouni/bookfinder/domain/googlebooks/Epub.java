package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Epub{

	@JsonProperty("isAvailable")
	private String isAvailable;

	@JsonProperty("downloadLink")
	private String downloadLink;

	@JsonProperty("acsTokenLink")
	private String acsTokenLink;

	public String getIsAvailable(){
		return isAvailable;
	}

	public String getDownloadLink(){
		return downloadLink;
	}

	public String getAcsTokenLink(){
		return acsTokenLink;
	}
}