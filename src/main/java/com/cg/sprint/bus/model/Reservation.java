package com.cg.sprint.bus.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservation_table")
public class Reservation {
	
		//@Id
	    @Id
		private int reservationid;
		@Column
		private String reservationStatus;
		@Column
		private String reservationType;
		@Column
		private LocalDate reservationDate;
		@Column
		private LocalTime reservationTime;
		@Column
		private String source;
		@Column
		private String destination;
		
		
		public Reservation(int reservationid, String reservationStatus, String reservatioType,
				LocalDate reservationDate, LocalTime reservationTime, String source, String destination) {
			super();
			this.reservationid = reservationid;
			this.reservationStatus = reservationStatus;
			this.reservationType = reservatioType;
			this.reservationDate = reservationDate;
			this.reservationTime = reservationTime;
			this.source = source;
			this.destination = destination;
		}
		public Reservation() {
			super();
		}

		
		public int getReservationid() {
			return reservationid;	
		}


		public void setReservationid(int reservationid) {
			this.reservationid = reservationid;
		}


		public String getReservationStatus() {
			return reservationStatus;
		}


		public void setReservationStatus(String reservationStatus) {
			this.reservationStatus = reservationStatus;
		}


		public String getReservationType() {
			return reservationType;
		}


		public void setReservationType(String reservationType) {
			this.reservationType = reservationType;
		}


		public LocalDate getReservationDate() {
			return reservationDate;
		}


		public void setReservationDate(LocalDate reservationDate) {
			this.reservationDate = reservationDate;
		}


		public LocalTime getReservationTime() {
			return reservationTime;
		}


		public void setReservationTime(LocalTime reservationTime) {
			this.reservationTime = reservationTime;
		}


		public String getSource() {
			return source;
		}


		public void setSource(String source) {
			this.source = source;
		}


		public String getDestination() {
			return destination;
		}


		public void setDestination(String destination) {
			this.destination = destination;
		}


		@Override
		public String toString() {
			return "Reservation [reservationid=" + reservationid + ", reservationStatus=" + reservationStatus
					+ ", reservatioType=" + reservationType + ", reservationDate=" + reservationDate
					+ ", reservationTime=" + reservationTime + ", source=" + source + ", destination=" + destination
					+ "]";
		}
		
		
		
}
