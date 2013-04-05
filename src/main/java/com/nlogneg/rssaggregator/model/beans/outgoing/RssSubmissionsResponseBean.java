package com.nlogneg.rssaggregator.model.beans.outgoing;

import java.io.Serializable;
import java.util.ArrayList;

public class RssSubmissionsResponseBean implements Serializable {
	
	private static final long serialVersionUID = 9007545679288418894L;
	private ArrayList<RssSubmissionResponseBean> submissionResults;

	public ArrayList<RssSubmissionResponseBean> getSubmissionResults() {
		return submissionResults;
	}

	public void setSubmissionResults(
			ArrayList<RssSubmissionResponseBean> submissionResults) {
		this.submissionResults = submissionResults;
	}
	
}
