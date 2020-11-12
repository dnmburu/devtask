package com.dmburu.kcb.payments.MpesaWalletDisbursementService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DarajaB2CResponse {
	 @JsonProperty("OriginatorConversationId") 
	    public String getOriginatorConversationId() { 
			 return this.originatorConversationId; } 
	    public void setOriginatorConversationId(String originatorConversationId) { 
			 this.originatorConversationId = originatorConversationId; } 
	    String originatorConversationId;
	    @JsonProperty("ConversationId") 
	    public String getConversationId() { 
			 return this.conversationId; } 
	    public void setConversationId(String conversationId) { 
			 this.conversationId = conversationId; } 
	    String conversationId;
	    @JsonProperty("ResponseDescription") 
	    public String getResponseDescription() { 
			 return this.responseDescription; } 
	    public void setResponseDescription(String responseDescription) { 
			 this.responseDescription = responseDescription; } 
	    String responseDescription;
}
