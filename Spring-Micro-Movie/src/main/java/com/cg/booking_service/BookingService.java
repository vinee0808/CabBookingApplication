package com.cg.booking_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.cg.booking_service")
@EnableDiscoveryClient(autoRegister = true)
public class BookingService {
	
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "booking-service");
		SpringApplication.run(BookingService.class, args);
	}
}
