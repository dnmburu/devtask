package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionInfo {
	 @JsonProperty("transactionId") 
	    public String getTransactionId() { 
			 return this.transactionId; } 
	    public void setTransactionId(String transactionId) { 
			 this.transactionId = transactionId; } 
	    String transactionId;
	    @JsonProperty("falconBalance") 
	    public String getFalconBalance() { 
			 return this.falconBalance; } 
	    public void setFalconBalance(String falconBalance) { 
			 this.falconBalance = falconBalance; } 
	    String falconBalance;
}
