package com.nlogneg.rssaggregator.model.beans.incoming;

public enum RssRequestType {
	RssRequest ("RssRequest"),
	RssRequests ("RssRequests"),
	RssSubmission ("RssSubmission"),
	RssSubmissions ("RssSubmissions");
	
	private final String requestType;
	
	private RssRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	public String toString(){
		return this.requestType;
	}
}
