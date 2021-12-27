package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Authentication;
import com.web.domain.SendMessage;

public interface SendMessageRepository extends CrudRepository<SendMessage, Long> {
	
	
	List<SendMessage> findAll();

}
