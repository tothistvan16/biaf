package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Month;


public interface MonthRepository extends CrudRepository<Month, Long> {

	
	List<Month> findAll();
	
}
