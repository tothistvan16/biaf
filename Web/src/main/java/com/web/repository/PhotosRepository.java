package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Day;
import com.web.domain.Photos;

public interface PhotosRepository extends CrudRepository<Photos, Long> {
	
	
	List<Photos> findAll();

}
