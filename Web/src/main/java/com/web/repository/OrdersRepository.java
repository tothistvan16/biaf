package com.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.web.domain.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
	
	

    List<Orders> findAll();


}