package jpaproduct.service;

import java.util.List;

import jpaproduct.entities.Customer;

public interface CustomerService {
	
	// create Customer in DB
	public Customer createCustomer(Customer customer);

	// retrieve all products
	public List<Customer> getAllCustomers();
}
