package com.volushkova.apifirst.apifirstclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.volushkova.apifirst.generated.petclient")
public class ApiFirstClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFirstClientApplication.class, args);
	}

}
