package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pdf{

	@JsonProperty("isAvailable")
	private boolean isAvailable;

	public boolean isIsAvailable(){
		return isAvailable;
	}
}