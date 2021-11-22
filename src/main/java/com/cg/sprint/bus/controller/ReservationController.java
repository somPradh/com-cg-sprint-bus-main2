package com.cg.sprint.bus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprint.bus.model.Reservation;
import com.cg.sprint.bus.service.ReservationService;



@RestController
public class ReservationController implements IReservationController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ReservationController.class);
	
	@Autowired
	private ReservationService revService;
	
//	@GetMapping("/getallrevs")
//	LOG.info("getAllRevs") 
//	return revsService.getAllReservation();
	
	
	@GetMapping("/getrevbyid/{eid}")
	public Reservation getRevsById(@PathVariable(name = "eid") int eid) {
		System.out.println("Controller getEmpById");
		return revService.getReservationById(eid);
	}
	
	@PostMapping("/addrev")
	public Reservation addRev(@RequestBody Reservation reservation) {
		System.out.println("Controller addRev");
		return revService.addReservation(reservation);
	}
	
	@PutMapping("/updaterev")
	public Reservation updateRev(@RequestBody Reservation employee) {
		System.out.println("Controller updateReservation");
		return revService.updateReservation(employee);
	}
	
	
	@DeleteMapping("/deleterevbyid/{eid}")
	public ResponseEntity<Reservation> deleteReservationById(@PathVariable int eid) {
		LOG.info("deleteRevById");
		Reservation rev = revService.deleteReservationById(eid);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee deleted successfully.");
		ResponseEntity<Reservation> response = new ResponseEntity<Reservation>(rev, headers, HttpStatus.OK);
		return response;
	}

	@Override
	public ResponseEntity<Reservation> addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Reservation> updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Reservation> deletereservation(int reservationId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
