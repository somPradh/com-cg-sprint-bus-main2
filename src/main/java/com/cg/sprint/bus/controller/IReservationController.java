package com.cg.sprint.bus.controller;

import org.springframework.http.ResponseEntity;

import com.cg.sprint.bus.model.Reservation;

public interface IReservationController {
	public ResponseEntity<Reservation> addReservation(Reservation reservation);
	public ResponseEntity<Reservation> updateReservation(Reservation reservation);
	public ResponseEntity<Reservation> deletereservation(int reservationId);


}
