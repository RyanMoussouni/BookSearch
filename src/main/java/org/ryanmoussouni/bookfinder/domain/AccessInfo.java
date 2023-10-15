package org.ryanmoussouni.bookfinder.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessInfo{

	@JsonProperty("accessViewStatus")
	private String accessViewStatus;

	@JsonProperty("country")
	private String country;

	@JsonProperty("viewability")
	private String viewability;

	@JsonProperty("pdf")
	private Pdf pdf;

	@JsonProperty("webReaderLink")
	private String webReaderLink;

	@JsonProperty("epub")
	private Epub epub;

	@JsonProperty("publicDomain")
	private boolean publicDomain;

	@JsonProperty("quoteSharingAllowed")
	private boolean quoteSharingAllowed;

	@JsonProperty("embeddable")
	private boolean embeddable;

	@JsonProperty("textToSpeechPermission")
	private String textToSpeechPermission;

	public String getAccessViewStatus(){
		return accessViewStatus;
	}

	public String getCountry(){
		return country;
	}

	public String getViewability(){
		return viewability;
	}

	public Pdf getPdf(){
		return pdf;
	}

	public String getWebReaderLink(){
		return webReaderLink;
	}

	public Epub getEpub(){
		return epub;
	}

	public boolean isPublicDomain(){
		return publicDomain;
	}

	public boolean isQuoteSharingAllowed(){
		return quoteSharingAllowed;
	}

	public boolean isEmbeddable(){
		return embeddable;
	}

	public String getTextToSpeechPermission(){
		return textToSpeechPermission;
	}
}