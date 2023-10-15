package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Volume{

	@JsonProperty("saleInfo")
	private SaleInfo saleInfo;

	@JsonProperty("kind")
	private String kind;

	@JsonProperty("volumeInfo")
	private VolumeInfo volumeInfo;

	@JsonProperty("etag")
	private String etag;

	@JsonProperty("id")
	private String id;

	@JsonProperty("accessInfo")
	private AccessInfo accessInfo;

	@JsonProperty("selfLink")
	private String selfLink;

	public SaleInfo getSaleInfo(){
		return saleInfo;
	}

	public String getKind(){
		return kind;
	}

	public VolumeInfo getVolumeInfo(){
		return volumeInfo;
	}

	public String getEtag(){
		return etag;
	}

	public String getId(){
		return id;
	}

	public AccessInfo getAccessInfo(){
		return accessInfo;
	}

	public String getSelfLink(){
		return selfLink;
	}
}