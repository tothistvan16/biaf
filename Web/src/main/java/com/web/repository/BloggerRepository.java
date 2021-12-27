package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Blogger;

public interface BloggerRepository extends CrudRepository<Blogger, Long> {

	List<Blogger> findAll();
	
}