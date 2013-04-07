package com.nlogneg.rssaggregator.model.daos;

import java.util.List;

import com.nlogneg.rssaggregator.model.rss.RssResource;

public interface RssResourceDao {
	public void store(RssResource rssResource);
	public void delete(Long id);
	public RssResource findById(Long id);
	public List<RssResource> findAll();
}
