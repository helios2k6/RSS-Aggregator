package com.nlogneg.rssaggregator.model.beans.incoming;

import java.io.Serializable;
import java.util.ArrayList;

public class RssSubmissionsBean implements Serializable, RssRequest {

	private static final long serialVersionUID = 99929942910896844L;
	
	private ArrayList<RssSubmissionBean> requests;

	public ArrayList<RssSubmissionBean> getRequests() {
		return requests;
	}

	public void setRequests(ArrayList<RssSubmissionBean> requests) {
		this.requests = requests;
	}
	
}
