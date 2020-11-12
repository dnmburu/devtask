package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestRoot {
	@JsonProperty("header")
	public RequestHeader getHeader() {
		return this.header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	RequestHeader header;

	@JsonProperty("requestPayload")
	public RequestPayloadBody getRequestPayload() {
		return this.requestPayload;
	}

	public void setRequestPayload(RequestPayloadBody requestPayload) {
		this.requestPayload = requestPayload;
	}

	RequestPayloadBody requestPayload;
}
