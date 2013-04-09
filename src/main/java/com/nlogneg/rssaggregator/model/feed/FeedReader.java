package com.nlogneg.rssaggregator.model.feed;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jdom2.JDOMException;

import com.nlogneg.rssaggregator.model.rss.RssItem;

public interface FeedReader {
	public List<RssItem> fetchFeed(URL url) throws IOException, JDOMException;
}
