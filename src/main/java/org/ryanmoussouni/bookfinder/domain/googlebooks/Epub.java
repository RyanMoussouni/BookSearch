package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Epub{

	@JsonProperty("isAvailable")
	private boolean isAvailable;

	public boolean isIsAvailable(){
		return isAvailable;
	}
}