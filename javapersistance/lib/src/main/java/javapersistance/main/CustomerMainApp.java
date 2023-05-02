package javapersistance.main;

import java.time.LocalDate;

import javapersistance.entities.Address;
import javapersistance.entities.Customer;
import javapersistance.service.CustomerService;
import javapersistance.service.CustomerServiceImpl;

public class CustomerMainApp {
	public static void main(String[] args) {
		Customer customer = new Customer();
//		Address address = new Address();
//		address.setCity("Gokak");
//		address.setCountry("Karnataka");
//		address.setStreet("Killa");
//		address.setPincode(591307);
//		
//		customer.setAddress(address);
//		customer.setName("Varun");
//		customer.setDateOfBirth(LocalDate.of(2000,1,07));
//		
//		CustomerService customerService = new CustomerServiceImpl();
//		customerService.createCustomer(customer);

		Customer customer1 = new Customer();
		Address address1 = new Address();
		address1.setCity("Mysore");
		address1.setCountry("India");
		address1.setStreet("Texas street");
		address1.setPincode(5601221);
		
		customer1.setAddress(address1);
		customer1.setName("Steve Rogers");
		customer1.setDateOfBirth(LocalDate.of(2000,10,15));
		customer1.setId(352);
		CustomerService customerService1 = new CustomerServiceImpl();
		//customerService.createCustomer(customer);
		customerService1.updateCustomer(customer1);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		CustomerService customerService = new CustomerServiceImpl();
		//customerService.createCustomer(customer);
		//customerService.updateCustomer(customer);
		System.out.println(customerService.getCustomers());
		System.out.println(customerService.customers());
		System.out.println(customerService.getCustomerbyId(1));
		System.out.println("**************using named query-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
		System.out.println(customerService.getAllCustomers());
		System.out.println(customerService.getCustomersCountryWise("United States of Bihar"));



		


}
	}
