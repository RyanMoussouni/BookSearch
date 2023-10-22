package org.ryanmoussouni.bookfinder.domain.googlebooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DownloadAccess{

	@JsonProperty("deviceAllowed")
	private String deviceAllowed;

	@JsonProperty("maxDownloadDevices")
	private String maxDownloadDevices;

	@JsonProperty("justAcquired")
	private String justAcquired;

	@JsonProperty("signature")
	private String signature;

	@JsonProperty("kind")
	private String kind;

	@JsonProperty("restricted")
	private String restricted;

	@JsonProperty("volumeId")
	private String volumeId;

	@JsonProperty("downloadsAcquired")
	private String downloadsAcquired;

	@JsonProperty("source")
	private String source;

	@JsonProperty("reasonCode")
	private String reasonCode;

	@JsonProperty("message")
	private String message;

	@JsonProperty("nonce")
	private String nonce;

	public String getDeviceAllowed(){
		return deviceAllowed;
	}

	public String getMaxDownloadDevices(){
		return maxDownloadDevices;
	}

	public String getJustAcquired(){
		return justAcquired;
	}

	public String getSignature(){
		return signature;
	}

	public String getKind(){
		return kind;
	}

	public String getRestricted(){
		return restricted;
	}

	public String getVolumeId(){
		return volumeId;
	}

	public String getDownloadsAcquired(){
		return downloadsAcquired;
	}

	public String getSource(){
		return source;
	}

	public String getReasonCode(){
		return reasonCode;
	}

	public String getMessage(){
		return message;
	}

	public String getNonce(){
		return nonce;
	}
}