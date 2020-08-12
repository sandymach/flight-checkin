package com.cts.pss.service;

import com.cts.pss.entity.CheckIn;

public interface CheckinService {

	

	CheckIn checkIn(long bookingId);

	CheckIn getCheckInInfo(long bookingId);

}