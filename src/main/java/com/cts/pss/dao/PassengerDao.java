package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer>{
	
	
	Passenger findByBookingRecord(BookingRecord bookingRecord);

}
