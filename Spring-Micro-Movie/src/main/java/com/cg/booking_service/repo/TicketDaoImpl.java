package com.cg.booking_service.repo;

import org.springframework.stereotype.Repository;

import com.cg.booking_service.dto.Ticket;
import com.cg.booking_service.repo.TicketCollection.TicketCollectionBuilder;

@Repository
public class TicketDaoImpl implements TicketDao {

	private TicketCollection repository;
	
	{
		repository = TicketCollectionBuilder.getInstance();
	}
	
	@Override
	public boolean saveTicket(Ticket ticket) {
		return repository.persist(ticket);
	}

	@Override
	public Ticket fetchTicketByID(int id) {
		return repository.findByID(id);
	}

}
