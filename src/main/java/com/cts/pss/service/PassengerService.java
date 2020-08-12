package com.cts.pss.service;

import com.cts.pss.entity.BookingRecord;
import com.cts.pss.entity.Passenger;

public interface PassengerService {
	Passenger findByBookingRecord(BookingRecord bookingRecord);

}
