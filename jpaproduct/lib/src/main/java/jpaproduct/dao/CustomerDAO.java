package jpaproduct.dao;


import java.util.List;

import jpaproduct.entities.Customer;

	public interface CustomerDAO {

		// create Customer in DB
		public Customer createCustomer(Customer customer);

		// retrieve all products
		public List<Customer> getAllCustomers();
	}


