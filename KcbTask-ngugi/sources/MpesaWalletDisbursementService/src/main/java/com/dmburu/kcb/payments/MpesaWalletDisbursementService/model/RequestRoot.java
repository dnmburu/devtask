package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
	@JsonProperty("header")
	public Header getHeader() {
		return this.header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	Header header;

	@JsonProperty("requestPayload")
	public RequestPayload getRequestPayload() {
		return this.requestPayload;
	}

	public void setRequestPayload(RequestPayload requestPayload) {
		this.requestPayload = requestPayload;
	}

	RequestPayload requestPayload;
}
