package com.nlogneg.rssaggregator.model.beans.outgoing;

import java.io.Serializable;
import java.util.ArrayList;

public class RssContentResponsesBean implements Serializable {

	private static final long serialVersionUID = 1243929072312223292L;
	
	private ArrayList<RssContentResponseBean> responses;

	public ArrayList<RssContentResponseBean> getResponses() {
		return responses;
	}

	public void setResponses(ArrayList<RssContentResponseBean> responses) {
		this.responses = responses;
	}
	
}
