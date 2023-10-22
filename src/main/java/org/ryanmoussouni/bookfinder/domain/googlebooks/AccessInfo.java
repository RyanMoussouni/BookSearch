package org.ryanmoussouni.bookfinder.domain.googlebooks;

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
	private String publicDomain;

	@JsonProperty("downloadAccess")
	private DownloadAccess downloadAccess;

	@JsonProperty("embeddable")
	private String embeddable;

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

	public String getPublicDomain(){
		return publicDomain;
	}

	public DownloadAccess getDownloadAccess(){
		return downloadAccess;
	}

	public String getEmbeddable(){
		return embeddable;
	}

	public String getTextToSpeechPermission(){
		return textToSpeechPermission;
	}
}