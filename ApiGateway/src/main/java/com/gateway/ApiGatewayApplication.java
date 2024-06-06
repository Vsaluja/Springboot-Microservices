package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This application wasn't working properly before because the dependencies I was using were latest and were different from what code with durgesh was using so I used durgesh's pom.xml file and it worked now it shows Netty started on PORT 8083 and now the API gateway is working

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
