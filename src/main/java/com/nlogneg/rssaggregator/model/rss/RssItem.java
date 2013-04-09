package com.nlogneg.rssaggregator.model.rss;

import java.io.Serializable;
import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

/**
 * Represents one RSS item from a particular RSS resource. This is dictated by
 * the actual RSS entry itself.
 * @author Andrew
 *
 */
@Entity
@Table(name = "RSS_ITEM")
public class RssItem implements Serializable {

	private static final long serialVersionUID = 5774269676532748693L;

	//ORM stuff
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "TITLE", length = 500)
	private String title;

	@Column(name = "DESCRIPTION", length = 500)
	private String description;

	@Column(name = "GUID", length = 500)
	private String guid;

	@NotNull
	@Column(name = "URL")
	private URL link;

	@NotNull
	@Column(name = "PUBLISH_DATE")
	@DateTimeFormat(style="yyyy-MM-dd")
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

	@Override
	public boolean equals(Object right)	{
		if(right == null) return false;
		if(this == right) return true;

		if(right instanceof RssItem) {
			return this.equals((RssItem)right);
		}
		return false;
	}

	public boolean equals(RssItem right){
		if(right == null) return false;

		return title.equals(right.title) 
				&& description.equals(right.description)
				&& guid.equals(right.guid)
				&& link.equals(right.link)
				&& publishDate.equals(right.publishDate);
	}

	@Override
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(title).append(":").append(link.toString()).append(":");
		return buffer.toString();
	}
}
