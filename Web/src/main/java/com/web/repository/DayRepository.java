package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Day;

public interface DayRepository extends CrudRepository<Day, Long> {
	
	List<Day> findAll();
	
	

}
