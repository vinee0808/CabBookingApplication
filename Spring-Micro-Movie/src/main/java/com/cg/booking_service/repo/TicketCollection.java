package com.cg.booking_service.repo;

import java.util.HashMap;

import com.cg.booking_service.dto.Ticket;

public class TicketCollection {

	public static final class TicketCollectionBuilder {
		private static TicketCollection collection;
		
		public static TicketCollection getInstance() {
			if (collection == null)
				return new TicketCollection();
			return collection;
		}
	}
	
	private static HashMap<Integer, Ticket> tickets;
	
	static {
		tickets = new HashMap<Integer, Ticket>();
	}
	
	public boolean persist(Ticket ticket) {
		tickets.put(ticket.getId(), ticket);
		return true;
	}
	
	public Ticket findByID(int id) {
		return tickets.get(id);
	}
}
