package com.cg.booking_service.repo;

import com.cg.booking_service.dto.Ticket;

public interface TicketDao {

	boolean saveTicket(Ticket ticket);
	
	Ticket fetchTicketByID(int id);
	
}
