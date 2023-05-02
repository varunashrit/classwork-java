package com.orderproc.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderproc.exception.CustomerNotFoundException;
import com.orderproc.model.Customer;
import com.orderproc.repositories.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
	private static final Logger logger = LogManager.getLogger(CustomerServiceImpl.class);
//	Logger logger = Logger.getLoggr(CustomerServiceImpl.class.getName());
	@Autowired
	CustomerRepository repository;

	public CustomerServiceImpl(CustomerRepository repository) {
		super();
		this.repository = repository;
	}

	@Transactional
	public Customer addCustomer(Customer customer) {
		try {
			repository.save(customer);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return customer;
	}

	@Transactional
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		Optional<Customer> optional = repository.findById(customer.getCustomerid());
		if (optional.isPresent()) {
			repository.save(customer);
			return optional.get();
		} else {
			throw new CustomerNotFoundException("Customer couldn't be Updated! ");
		}
	}

	@Transactional
	public Customer deleteCustomer(Integer customerid) throws CustomerNotFoundException {
		Optional<Customer> optional = repository.findById(customerid);
		if (optional.isPresent()) {
			repository.deleteById(customerid);
			return optional.get();
		} else {
			throw new CustomerNotFoundException("Customer not found for delete operation!");
		}
	}

	public Customer viewCustomer(Integer customerid) throws CustomerNotFoundException {
		Optional<Customer> optional = repository.findById(customerid);
		try {
			if (optional.isPresent()) {
				repository.findById(customerid);
			} else {
				throw new CustomerNotFoundException("Customer not found with the matching ID!");
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
			throw new CustomerNotFoundException("Customer not found with the matching ID!");
		}
		return optional.get();
	}

	public List<Customer> viewAllCustomers() {
		List<Customer> customerList = null;
		try {
			customerList = (List<Customer>) repository.findAll();
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return customerList;
	}
}
