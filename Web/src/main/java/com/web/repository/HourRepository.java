package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Hour;

public interface HourRepository extends CrudRepository<Hour, Long> {
	
	
	List<Hour> findAll();

}
