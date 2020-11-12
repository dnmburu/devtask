package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsePayloadBody {
	@JsonProperty("transactionInfo") 
    public TransactionInfo getTransactionInfo() { 
		 return this.transactionInfo; } 
    public void setTransactionInfo(TransactionInfo transactionInfo) { 
		 this.transactionInfo = transactionInfo; } 
    TransactionInfo transactionInfo;
}
