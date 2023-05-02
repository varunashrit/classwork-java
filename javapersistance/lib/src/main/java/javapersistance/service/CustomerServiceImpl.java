package javapersistance.service;

import java.util.List;

import javapersistance.dao.CustomerDAO;
import javapersistance.dao.CustomerDAOImpl;
import javapersistance.entities.Customer;

public class CustomerServiceImpl implements CustomerService {

	
		
		private CustomerDAO customerDAO = new CustomerDAOImpl();
		@Override
		public Customer createCustomer(Customer customer) {
			
			return customerDAO.createCustomer(customer);
		}
		@Override
		public Customer retrieveCustomer(Customer customer) {
			// TODO Auto-generated method stub
			return customerDAO.retrieveProduct(customer.getId());
		}
		@Override
		public void updateCustomer(Customer customer) {
			customerDAO.updateCustomer(customer);
			
		}

		@Override
		public List<Customer> getCustomers() {
			
			return customerDAO.getCustomers();
		}

		@Override
		public List<Customer> customers() {
			return customerDAO.customers();
		}

		@Override
		public Customer getCustomerbyId(Integer customerId) {
			
			return customerDAO.getCustomerbyId(customerId);
		}
		@Override
		public List<Customer> getAllCustomers() {
			return customerDAO.getAllCustomers();
		}

		@Override
		public List<Customer> getCustomersCountryWise(String country) {
			return customerDAO.getCustomersCountryWise(country);
		}


	}


