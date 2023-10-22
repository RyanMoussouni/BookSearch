package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetailPrice{

	@JsonProperty("amount")
	private String amount;

	@JsonProperty("currencyCode")
	private String currencyCode;

	public String getAmount(){
		return amount;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}