package com.nlogneg.rssaggregator.model.beans.outgoing;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;

import com.nlogneg.rssaggregator.model.RssItem;

public class RssContentResponseBean implements Serializable {

	private static final long serialVersionUID = 3810015481947370746L;
	
	private URL url;
	private ArrayList<RssItem> rssItems;
	
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	public ArrayList<RssItem> getRssItems() {
		return rssItems;
	}
	public void setRssItems(ArrayList<RssItem> rssItems) {
		this.rssItems = rssItems;
	}
	
}
