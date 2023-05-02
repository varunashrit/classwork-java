package javapersistance.service;

import java.util.List;

import javapersistance.entities.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public Customer retrieveCustomer(Customer customer);
	// Using merge method
	public void updateCustomer(Customer customer);
	// Retrieve All customers
		public List<Customer> getCustomers();

		// Retrieve All customers using typed query
		public List<Customer> customers();

		// Get getCustomerbyId
		public Customer getCustomerbyId(Integer customerId);
		// Get All customers using a named query
		public List<Customer> getAllCustomers();

		// Get all customers whose country is United States of Bihar
		public List<Customer> getCustomersCountryWise(String country);



}
