package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
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