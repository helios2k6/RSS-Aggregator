package com.nlogneg.rssaggregator.model.daos;

import java.util.List;

import com.nlogneg.rssaggregator.model.rss.RssItem;

public interface RssItemDao {
	public void store(RssItem rssItem);
	public void delete(Long rssItemId);
	public RssItem findById(Long rssItemId);
	public List<RssItem> findAll();
}
