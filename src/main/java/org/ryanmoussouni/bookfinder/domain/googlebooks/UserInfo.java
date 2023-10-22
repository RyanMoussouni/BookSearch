package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo{

	@JsonProperty("readingPosition")
	private String readingPosition;

	@JsonProperty("review")
	private String review;

	@JsonProperty("isPurchased")
	private String isPurchased;

	@JsonProperty("isPreordered")
	private String isPreordered;

	@JsonProperty("updated")
	private String updated;

	public String getReadingPosition(){
		return readingPosition;
	}

	public String getReview(){
		return review;
	}

	public String getIsPurchased(){
		return isPurchased;
	}

	public String getIsPreordered(){
		return isPreordered;
	}

	public String getUpdated(){
		return updated;
	}
}