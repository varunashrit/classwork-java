package firstgradleproject.dao;

import java.util.List;

import firstgradleproject.data.Customer;

public interface CustomerDAO {

	// Create
	public Customer createCustomer(Customer customer);

	// Retrieve
	public Customer getCustomerById(Integer customerId);

	// Update
	public Customer updateCustomer(Customer customer);

	// Delete
	public String deleteCustomerById(Integer customerId);

	// Retrieve All Customer
	public List<Customer> getCustomers();

	// Retrieve Customer by name
	public Customer getCustomerByName(String customerName);

}
