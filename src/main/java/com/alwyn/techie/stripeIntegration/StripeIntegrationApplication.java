package com.alwyn.techie.stripeIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.alwyn.techie.*", "org.springdoc"})
public class StripeIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripeIntegrationApplication.class, args);
	}

}
