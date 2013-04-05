package com.nlogneg.rssaggregator.model.beans.incoming;

import java.io.Serializable;
import java.util.ArrayList;

public class RssContentRequestsBean implements Serializable, RssRequest {

	private static final long serialVersionUID = 7309399641566199458L;
	
	private ArrayList<RssContentRequestBean> requests;

	public ArrayList<RssContentRequestBean> getRequests() {
		return requests;
	}

	public void setRequests(ArrayList<RssContentRequestBean> requests) {
		this.requests = requests;
	}
	
}
