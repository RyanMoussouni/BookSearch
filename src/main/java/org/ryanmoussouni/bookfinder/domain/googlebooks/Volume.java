package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
@JsonIgnoreProperties
public class Volume{

	@JsonProperty("userInfo")
	private UserInfo userInfo;

	@JsonProperty("saleInfo")
	private SaleInfo saleInfo;

	@JsonProperty("searchInfo")
	private SearchInfo searchInfo;

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

	public UserInfo getUserInfo(){
		return userInfo;
	}

	public SaleInfo getSaleInfo(){
		return saleInfo;
	}

	public SearchInfo getSearchInfo(){
		return searchInfo;
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