package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleInfo{

	@JsonProperty("country")
	private String country;

	@JsonProperty("isEbook")
	private boolean isEbook;

	@JsonProperty("saleability")
	private String saleability;

	public String getCountry(){
		return country;
	}

	public boolean isIsEbook(){
		return isEbook;
	}

	public String getSaleability(){
		return saleability;
	}
}