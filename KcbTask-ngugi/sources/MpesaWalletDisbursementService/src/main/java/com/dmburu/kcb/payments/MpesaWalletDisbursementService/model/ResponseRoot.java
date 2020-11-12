package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseRoot {
	@JsonProperty("header")
	public ResponseHeader getHeader() {
		return this.header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	ResponseHeader header;

	@JsonProperty("responsePayload")
	public ResponsePayloadBody getResponsePayload() {
		return this.responsePayload;
	}

	public void setResponsePayload(ResponsePayloadBody responsePayload) {
		this.responsePayload = responsePayload;
	}

	ResponsePayloadBody responsePayload;
}
