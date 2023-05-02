package javapersistance.dao;

import java.util.List;

import javapersistance.entities.Customer;

public interface CustomerDAO {

	
	
	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer retrieveProduct(Integer productId);
	// Retrieve All customers
		public List<Customer> getCustomers();

		// Retrieve All customers using typed query
		public List<Customer> customers();
		
		//Get getCustomerbyId
		public Customer getCustomerbyId(Integer customerId);
		public List<Customer> getAllCustomers();
		public List<Customer> getCustomersCountryWise(String country);

	
}

