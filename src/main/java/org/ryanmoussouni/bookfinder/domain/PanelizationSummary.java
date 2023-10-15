package org.ryanmoussouni.bookfinder.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PanelizationSummary{

	@JsonProperty("containsImageBubbles")
	private boolean containsImageBubbles;

	@JsonProperty("containsEpubBubbles")
	private boolean containsEpubBubbles;

	public boolean isContainsImageBubbles(){
		return containsImageBubbles;
	}

	public boolean isContainsEpubBubbles(){
		return containsEpubBubbles;
	}
}