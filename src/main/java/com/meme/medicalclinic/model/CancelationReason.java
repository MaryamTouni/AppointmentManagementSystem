package com.meme.medicalclinic.model;

public enum CancelationReason {

	NOSHOW("No show"), ONREQUEST("based on patient request"), APOLOGY("Physician apology");
	private String value;

	private CancelationReason(String str) {
		value = str;
	}

	public String getValue() {
		return this.value;
	}

}
