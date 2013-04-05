package com.nlogneg.rssaggregator.model.beans.outgoing;

import java.io.Serializable;
import java.net.URL;

public class RssSubmissionResponseBean implements Serializable {

	private static final long serialVersionUID = 6993503493023181235L;
	
	private URL url;
	private boolean wasSuccessful;
	
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public boolean isWasSuccessful() {
		return wasSuccessful;
	}
	public void setWasSuccessful(boolean wasSuccessful) {
		this.wasSuccessful = wasSuccessful;
	}
	
}
