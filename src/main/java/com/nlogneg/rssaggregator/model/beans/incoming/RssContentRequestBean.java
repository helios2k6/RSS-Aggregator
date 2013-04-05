package com.nlogneg.rssaggregator.model.beans.incoming;

import java.io.Serializable;
import java.net.URL;

import org.joda.time.DateTime;

public class RssContentRequestBean implements Serializable, RssRequest {

	private static final long serialVersionUID = 6793823119464918855L;
	
	private URL url;
	private DateTime fromDate;
	
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public DateTime getFromDate() {
		return fromDate;
	}
	public void setFromDate(DateTime fromDate) {
		this.fromDate = fromDate;
	}
	
}
