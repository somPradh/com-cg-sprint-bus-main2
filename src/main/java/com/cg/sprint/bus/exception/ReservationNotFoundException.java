package com.cg.sprint.bus.exception;


public class ReservationNotFoundException extends RuntimeException  {
	
	

	private static final long serialVersionUID = 1L;

	public ReservationNotFoundException() {
		super();

	}

	public ReservationNotFoundException(String message) {
		super(message);

	}


}