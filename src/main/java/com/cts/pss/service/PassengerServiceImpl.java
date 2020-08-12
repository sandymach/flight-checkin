package com.cts.pss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pss.dao.PassengerDao;
import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService{

	@Autowired
	private PassengerDao passengerDao;
	@Override
	public Passenger findByBookingRecord(BookingRecord bookingRecord) {
		// TODO Auto-generated method stub
		return passengerDao.findByBookingRecord(bookingRecord);
	}

}
