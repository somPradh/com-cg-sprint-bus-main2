package com.cg.sprint.bus.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.cg.sprint.bus.model.Reservation;


@Repository
public class ReservationRepository {

	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Reservation> findById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(int reservationid) {
		// TODO Auto-generated method stub
		return false;
	}

	public Reservation save(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int eid) {
		// TODO Auto-generated method stub
		
	}

}
