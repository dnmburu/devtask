package com.dmburu.kcb.payments.MpesaWalletDisbursementService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import com.dmburu.kcb.payments.MpesaWalletDisbursementService.model.RequestRoot;
import com.dmburu.kcb.payments.MpesaWalletDisbursementService.model.ResponseRoot;
import com.dmburu.kcb.payments.MpesaWalletDisbursementService.model.TokenResponse;

public class DarajaService {
	@Autowired
	private Environment env;

	String darajaTokenEndpoint = env.getProperty("mpesa.daraja.token.endpoint");
	String darajaB2CEndpoint = env.getProperty("mpesa.daraja.b2c.endpoint");
	RestTemplate template = new RestTemplate();

	public String sendRequest() {

		// HttpHeaders headers = new HttpHeaders();
		// headers.setContentType(MediaType.APPLICATION_JSON);
		// headers.set("Authorization", "Basic "+ accessToken);
		//
		// HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
		String accessToken = "";
		// template.se
		// accessToken = template.getForEntity(darajaTokenEndpoint,
		// TokenResponse.class,).getBody().getAccess_token();
		return accessToken;
	}

	public ResponseRoot sendMpesaRequest(RequestRoot request) {

		ResponseRoot resp = new ResponseRoot();

		return resp;
	}

}
