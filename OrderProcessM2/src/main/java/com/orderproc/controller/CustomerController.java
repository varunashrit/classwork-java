package com.orderproc.controller;

import java.util.List;
import java.util.logging.Level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import com.orderproc.exception.CustomerNotFoundException;
import com.orderproc.model.Customer;
import com.orderproc.service.CustomerService;
import com.orderproc.service.CustomerServiceImpl;

@RestController
public class CustomerController {

	// Logger logger = Logger.getLogger(CustomerController.class.getName());
//	private static final Logger logger = LogManager.getLogger(CustomerController.class.getName());
//
//	public CustomerController() {
//		logger.log(null, null, Level.INFO, "-----> Customer Rest Controller Working!");
//	}

	@Autowired
	private CustomerService customerService;

	@GetMapping("/home")
	public String homeRequest() {
		return "Welcome : Order Service application";
	}

	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody @Valid Customer customer) {
		this.customerService.addCustomer(customer);
		return customer;
	}

	@GetMapping("/view/{custid}")
	public Customer viewCustomer(@PathVariable("custid") int custid) throws CustomerNotFoundException {
		return this.customerService.viewCustomer(custid);
	}

	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody @Valid Customer customer) throws CustomerNotFoundException {
		return this.customerService.updateCustomer(customer);
	}

	@GetMapping("/viewAllcustomers")
	public List<Customer> viewAllCustomer() {
		return customerService.viewAllCustomers();
	}

	@DeleteMapping("/delete/{custid}")
	public String deleteCustomer(@PathVariable("custid") int custid) throws CustomerNotFoundException {
		customerService.deleteCustomer(custid);
		return "Deleted Customer is:" + custid;
	}
}
