package com.cg.entry_point.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.booking_service.dto.Ticket;
import com.cg.entry_point.dao.MovieDao;
import com.cg.entry_point.dto.MovieDetails;

@RestController
@RequestMapping("/movie-app")
public class EntryController {

	@Autowired
	private RestTemplate delegator;
	
	@Autowired MovieDao dao;
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	private final static String TICKET_POST_URL = "http://booking-service/ticket/book";
	private final static String TICKET_GET_URL = "http://booking-service/ticket/";
	
	@PostMapping(value = "/book-ticket", consumes = "application/json")
	public boolean bookMovie(@RequestBody MovieDetails details) {
		ResponseEntity<Boolean> res = delegator.postForEntity(TICKET_POST_URL, details.getTicket(), Boolean.class);
		return dao.saveMovie(details.getMovie()) && res.getBody();
	}
}
