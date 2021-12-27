package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Authentication;
import com.web.domain.Subscribe;

public interface SubscribeRepository extends CrudRepository<Subscribe, Long> {
	
	List<Subscribe> findAll();
    
}
