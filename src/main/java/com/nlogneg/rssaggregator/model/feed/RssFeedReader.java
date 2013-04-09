package com.nlogneg.rssaggregator.model.feed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.nlogneg.rssaggregator.model.rss.RssItem;

public class RssFeedReader implements FeedReader{

	private static final SAXBuilder builder = new SAXBuilder();
	
	@Override
	public List<RssItem> fetchFeed(URL url) throws IOException, JDOMException {
		String urlContents = readFromURL(url);
		Document rootDocument = builder.build(new StringReader(urlContents));
		
		
		return null;
	}
	
	private static final String readFromURL(URL url) throws IOException {
		URLConnection connection = url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		StringBuffer buffer = new StringBuffer();
		String inputLine;
		while((inputLine = reader.readLine()) != null){
			buffer.append(inputLine);
		}
		
		return buffer.toString();
	}

}
