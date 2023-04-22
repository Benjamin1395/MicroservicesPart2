package com.concept.pucp.microservices.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicesPucpUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesPucpUsersApplication.class, args);
	}

}
