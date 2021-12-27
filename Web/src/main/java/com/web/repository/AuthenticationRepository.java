package com.web.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Authentication;
import com.web.domain.Blogger;

public interface AuthenticationRepository extends CrudRepository<Authentication, Long> {
	
	
	List<Authentication> findAll();
	Authentication findByPassword(String password);
	
}