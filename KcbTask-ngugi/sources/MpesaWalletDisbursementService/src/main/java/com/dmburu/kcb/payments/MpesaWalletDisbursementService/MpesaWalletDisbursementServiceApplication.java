package com.dmburu.kcb.payments.MpesaWalletDisbursementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class MpesaWalletDisbursementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpesaWalletDisbursementServiceApplication.class, args);
	}

}
