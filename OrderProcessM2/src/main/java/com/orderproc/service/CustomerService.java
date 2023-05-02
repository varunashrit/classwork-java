package com.orderproc.service;

import java.util.List;

import com.orderproc.exception.CustomerNotFoundException;
import com.orderproc.model.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer) ;
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(Integer customerid) throws CustomerNotFoundException;
	public Customer viewCustomer(Integer customerid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers();
}
