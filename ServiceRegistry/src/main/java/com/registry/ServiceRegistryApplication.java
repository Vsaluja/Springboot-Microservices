package com.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//This is a server which will contain details about the other microservices in our app so we have eurake server dependency in this project. We need to disable this service to act as a client because this is a server we can do that in the application.properties file.

//We have made the port 8761 because if we give some other port the server still runs on http://localhost:8761/eureka/ so it is better to give port as 8761

//After we have created configured our server we need to add dependency of spring cloud version and dependency management for spring cloud then add depenedency for eureka client in quiz and question microservice then add the eureka server properties in the application.properties of both microservices

//run all the 3 services quiz, question and serverregistry use the serverregistry URL on google and you can access the microservices there http://localhost:8761/ under the instances

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
