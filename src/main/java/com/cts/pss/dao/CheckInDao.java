package com.cts.pss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.CheckIn;


public interface CheckInDao extends JpaRepository<CheckIn, Integer>{

	CheckIn findByBookingId(long bookingId);
	boolean existsByBookingId(long bookingId);
}
