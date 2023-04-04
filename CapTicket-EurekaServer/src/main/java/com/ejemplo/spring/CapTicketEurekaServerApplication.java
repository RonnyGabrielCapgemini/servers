package com.ejemplo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CapTicketEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapTicketEurekaServerApplication.class, args);
	}

}
