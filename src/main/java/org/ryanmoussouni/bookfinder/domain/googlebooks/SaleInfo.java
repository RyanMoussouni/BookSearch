package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleInfo{

	@JsonProperty("country")
	private String country;

	@JsonProperty("isEbook")
	private String isEbook;

	@JsonProperty("saleability")
	private String saleability;

	@JsonProperty("buyLink")
	private String buyLink;

	@JsonProperty("onSaleDate")
	private String onSaleDate;

	@JsonProperty("retailPrice")
	private RetailPrice retailPrice;

	@JsonProperty("listPrice")
	private ListPrice listPrice;

	public String getCountry(){
		return country;
	}

	public String getIsEbook(){
		return isEbook;
	}

	public String getSaleability(){
		return saleability;
	}

	public String getBuyLink(){
		return buyLink;
	}

	public String getOnSaleDate(){
		return onSaleDate;
	}

	public RetailPrice getRetailPrice(){
		return retailPrice;
	}

	public ListPrice getListPrice(){
		return listPrice;
	}
}