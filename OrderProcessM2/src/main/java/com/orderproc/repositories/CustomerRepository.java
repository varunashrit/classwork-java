package com.orderproc.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.orderproc.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	public Optional<Customer> findByCustomername(String customername);
}
