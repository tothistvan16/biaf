package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Reservation;


public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	
	List<Reservation> findAll();
	

}
