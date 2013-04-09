package com.nlogneg.rssaggregator.model.rss;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The object that binds the concept of an RSS source (where the data is coming from)
 * and the RSS items (the actual data itself).
 * 
 * This keeps a list of RSS 
 * @author Andrew
 *
 */
@Entity
@Table(name = "RSS_ENTITY")
public class RssEntity implements Serializable {

	private static final long serialVersionUID = 3756332072930479696L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@OneToOne
	@JoinTable(name = "RSS_ENTITY_RSS_RESOURCE",
	joinColumns = {@JoinColumn(name = "ID")},
	inverseJoinColumns = {@JoinColumn(name = "ID")})
	private RssResource rssResource;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "RSS_ENTITY_RSS_ITEM",
	joinColumns = {@JoinColumn(name="ID")},
	inverseJoinColumns = {@JoinColumn(name="ID")})
	private List<RssItem> rssItem;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<RssItem> getRssItem() {
		return rssItem;
	}
	public void setRssItem(List<RssItem> rssItem) {
		this.rssItem = rssItem;
	}
	public RssResource getRssResource() {
		return rssResource;
	}
	public void setRssResource(RssResource rssResource) {
		this.rssResource = rssResource;
	}
}
