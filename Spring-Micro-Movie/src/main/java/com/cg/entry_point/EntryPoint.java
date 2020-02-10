package com.cg.entry_point;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@EnableDiscoveryClient(autoRegister = true)
@ComponentScan(basePackages = "com.cg.entry_point")
public class EntryPoint {
	
//	private static RestTemplate delegator;

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "entry-point");
		SpringApplication.run(EntryPoint.class, args);
	}
	
//	@LoadBalanced
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
////		return delegator == null ? new RestTemplate() : delegator;
//		System.out.println("Called");
//		return builder.build();
//	}

}
