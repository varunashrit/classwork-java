package firstgradleproject.service;

import java.util.List;

import firstgradleproject.dao.CustomerDAO;
import firstgradleproject.dao.CustomerDAOImpl;
import firstgradleproject.data.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer cust = customerDAO.createCustomer(customer);
		return cust;
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer cust = customerDAO.getCustomerById(customerId);
		
		return cust;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		CustomerDAO customerDAO = new CustomerDAOImpl();
		Customer cust = customerDAO.updateCustomer(customer);
		
		return cust;
	}

	@Override
	public String deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		CustomerDAO customerDAO = new CustomerDAOImpl();
		String message = customerDAO.deleteCustomerById(customerId);
		return message;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		CustomerDAO customerDAO = new CustomerDAOImpl();
		List<Customer> customerList = customerDAO.getCustomers(); 
		return customerList;
	}

	@Override
	public Customer getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
