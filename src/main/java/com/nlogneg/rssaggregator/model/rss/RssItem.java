package com.nlogneg.rssaggregator.model.rss;

import java.io.Serializable;
import java.net.URL;

import org.joda.time.DateTime;

/**
 * Represents one RSS item from a particular RSS resource. This is dictated by
 * the actual RSS entry itself.
 * @author Andrew
 *
 */
public class RssItem implements Serializable {

	private static final long serialVersionUID = 5774269676532748693L;
	
	//ORM stuff
	private Long id;
	
	private String title;
	private String description;
	private String guid;
	private URL link;
	private DateTime publishDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public URL getLink() {
		return link;
	}
	public void setLink(URL link) {
		this.link = link;
	}
	public DateTime getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(DateTime publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
