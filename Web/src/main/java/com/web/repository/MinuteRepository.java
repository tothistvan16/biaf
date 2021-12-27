package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Minute;

public interface MinuteRepository extends CrudRepository<Minute, Long> {
	
	List<Minute> findAll();

}
