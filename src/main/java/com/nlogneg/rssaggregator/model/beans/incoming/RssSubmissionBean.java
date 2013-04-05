package com.nlogneg.rssaggregator.model.beans.incoming;

import java.io.Serializable;
import java.net.URL;

public class RssSubmissionBean implements Serializable, RssRequest {

	private static final long serialVersionUID = 3051409549951648880L;
	
	private URL url;
	private long maxEntries;
	
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public long getMaxEntries() {
		return maxEntries;
	}
	public void setMaxEntries(long maxEntries) {
		this.maxEntries = maxEntries;
	}
}
