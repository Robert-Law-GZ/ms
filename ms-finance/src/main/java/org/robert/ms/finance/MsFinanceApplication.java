package org.robert.ms.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsFinanceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsFinanceApplication.class, args);
	}
}
