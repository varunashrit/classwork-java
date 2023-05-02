package jpaproduct.service;

import java.util.List;

import jpaproduct.dao.CustomerDAO;
import jpaproduct.dao.CustomerDAOImpl;
import jpaproduct.entities.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO cd = new CustomerDAOImpl();
	
	@Override
	public Customer createCustomer(Customer customer) {
		return cd.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return cd.getAllCustomers();
	}


}
