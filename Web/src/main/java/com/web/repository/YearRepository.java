package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Year;



public interface YearRepository extends CrudRepository<Year, Long> {
	
	List<Year> findAll();

}
