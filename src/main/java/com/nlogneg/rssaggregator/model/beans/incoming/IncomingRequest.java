package com.nlogneg.rssaggregator.model.beans.incoming;

import java.io.Serializable;

public class IncomingRequest implements Serializable {
	
	private static final long serialVersionUID = -5028107418816021592L;
	
	private RssRequestType requestType;
	private RssRequest request;
	
	public RssRequestType getRequestType() {
		return requestType;
	}
	public void setRequestType(RssRequestType requestType) {
		this.requestType = requestType;
	}
	public RssRequest getRequest() {
		return request;
	}
	public void setRequest(RssRequest request) {
		this.request = request;
	}
	
}
