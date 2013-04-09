package com.nlogneg.rssaggregator.model.daos;

import java.util.List;

import com.nlogneg.rssaggregator.model.rss.RssEntity;

public interface RssEntityDao {
	public void store(RssEntity rssEntity);
	public void delete(Long rssEntityId);
	public RssEntity findById(Long rssEntityId);
	public List<RssEntity> findAll();
}
