package com.dmburu.kcb.payments.MpesaWalletDisbursementService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

public class DarajaService {
	@Autowired
	private Environment env;
	
	String darajaTokenEndpoint = env.getProperty("mpesa.daraja.token.endpoint");
	String darajaB2CEndpoint = env.getProperty("mpesa.daraja.b2c.endpoint");
	RestTemplate template = new RestTemplate();
	
}
