package com.dmburu.kcb.payments.MpesaWalletDisbursementService.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import com.dmburu.kcb.payments.MpesaWalletDisbursementService.model.RequestRoot;
import com.dmburu.kcb.payments.MpesaWalletDisbursementService.model.ResponseRoot;

@RestController
public class B2CRestController {
	@RequestMapping(path="/api/sendToMpesa",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE},consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseRoot add(@RequestBody RequestRoot request) {
		//TO DO Create call service class to call daraja API
		
		ResponseRoot resp = new ResponseRoot();
		
		
		return resp;
	}
	
	@RequestMapping(path="/api/",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE},consumes=MediaType.APPLICATION_JSON_VALUE)
	public String test(@RequestBody String request) {
		//TO DO Create user in DB
		return "Success";
	}
	
}
