package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * This class shall act as the Eureka server.
 * Properties file - eureka-server.properties
 */
@SpringBootApplication
@EnableEurekaServer
public class ParentServer {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-server");
		SpringApplication.run(ParentServer.class, args);
	}

}
