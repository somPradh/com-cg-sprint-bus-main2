package com.cg.sprint.bus.service;

import com.cg.sprint.bus.model.Reservation;

public interface IReservationService {
	
	public Reservation addReservation(Reservation reservation);
	public Reservation updateReservation(Reservation reservation);
	public Reservation deleteReservation(int reservationId);

}
