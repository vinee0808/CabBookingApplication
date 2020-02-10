package com.cg.booking_service.dto;

public class Ticket {

	private int id;
	private String movieName;
	private int numSeats;
	
	public Ticket(int id, String movieName, int numSeats) {
		this.id = id;
		this.movieName = movieName;
		this.numSeats = numSeats;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public int getNumSeats() {
		return numSeats;
	}
	
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", movieName=" + movieName + ", numSeats=" + numSeats + "]";
	}
	
}
