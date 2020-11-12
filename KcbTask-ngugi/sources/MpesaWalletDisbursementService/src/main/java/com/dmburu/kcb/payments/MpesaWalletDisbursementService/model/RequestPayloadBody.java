package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestPayloadBody {
	@JsonProperty("transactionInfo")
	public RequestTransactionInfo getTransactionInfo() {
		return this.transactionInfo;
	}

	public void setTransactionInfo(RequestTransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	RequestTransactionInfo transactionInfo;
}
