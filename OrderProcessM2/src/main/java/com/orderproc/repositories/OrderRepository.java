package com.orderproc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.orderproc.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
	
}
