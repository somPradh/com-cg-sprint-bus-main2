package com.cg.sprint.bus.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.sprint.bus.exception.ReservationNotFoundException;
import com.cg.sprint.bus.model.Reservation;
import com.cg.sprint.bus.repository.ReservationRepository;

@Component
@Service
public class ReservationService implements IReservationService {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(ReservationService.class);
	@Autowired
	private ReservationRepository revsRepository;
	
	public List<Reservation> getAllReservation() {
		System.out.println("Service getAllReservation");
		return revsRepository.findAll();
	}
	
	public Reservation getReservationById(int eid) {
		LOG.info("getReservationById");
		Optional<Reservation> revsOpt = revsRepository.findById(eid);
		if (revsOpt.isPresent()) {
			LOG.info("Reservation is available.");
			return revsOpt.get();
		} else {
			LOG.info("Reservation is NOT available.");
			throw new ReservationNotFoundException(eid + " this reservation is not found.");
		}
	}
	
	public Reservation addReservation(Reservation reservation) {
		System.out.println("Service addReservation");
		if (!revsRepository.existsById(reservation.getReservationid()))
			return revsRepository.save(reservation);
		System.out.println(reservation.getReservationid() + " already exists.");
		return null;
	}
	
	public Reservation updateReservation(Reservation reservation) {
		System.out.println("Service updateReservation");
		if (revsRepository.existsById(reservation.getReservationid()))

			return revsRepository.save(reservation);
		System.out.println(reservation.getReservationid() + " does not exist.");
		return null;
	}
	
	public Reservation deleteReservationById(int eid) {
		LOG.info("deleteEmployeeById");
		Optional<Reservation> revsOpt = revsRepository.findById(eid);
		if (revsOpt.isPresent()) {
			revsRepository.deleteById(eid);
			return revsOpt.get();
		} else {
			throw new ReservationNotFoundException(eid + " this employee does not exist.");
		}
	}

	@Override
	public Reservation deleteReservation(int reservationId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


	


}