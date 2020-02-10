package com.cg.entry_point.dto;

import com.cg.booking_service.dto.Ticket;

public class MovieDetails {

	private Movie movie;
	private Ticket ticket;
	
	public MovieDetails(Movie movie, Ticket ticket) {
		super();
		this.movie = movie;
		this.ticket = ticket;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovieName(Movie movieName) {
		this.movie = movie;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
