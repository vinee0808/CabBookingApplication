package com.cg.booking_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.booking_service.dto.Ticket;
import com.cg.booking_service.repo.TicketDao;

@RestController
@RequestMapping(value = "/ticket")
public class BookingController {
	
	@Autowired
	private TicketDao dao;

	@PostMapping(value = "/book", consumes = "application/json")
	public boolean bookTicket(@RequestBody Ticket ticket) {
		return dao.saveTicket(ticket);
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Ticket findTicket(@PathVariable int id) {
		return dao.fetchTicketByID(id);
	}
}
