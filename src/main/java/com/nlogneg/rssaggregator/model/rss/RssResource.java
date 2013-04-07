package com.nlogneg.rssaggregator.model.rss;

import java.io.Serializable;
import java.net.URL;

/**
 * Represents the internal class for an RSS resource 
 * @author Andrew
 *
 */
public class RssResource implements Serializable {

	private static final long serialVersionUID = 8349072298806076908L;
	
	//ORM Stuff
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String title;
	private String description;
	private URL url;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	
	
}
