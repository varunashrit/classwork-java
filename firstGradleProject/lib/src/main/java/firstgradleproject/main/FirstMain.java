package firstgradleproject.main;

import firstgradleproject.data.Address;
import firstgradleproject.data.Customer;
import firstgradleproject.service.CustomerService;
import firstgradleproject.service.CustomerServiceImpl;

public class FirstMain {

	public static void main(String[] args) {
		System.out.println("First Gradle project");
		
		
		Address address = new Address();
		address.setAddressId(3);
//		address.setCity("Bengaluru");
//		address.setHouseNo(111);
//		address.setState("Karnataka");
//		address.setStreet("Nallurhalli");
//		address.setCountry("India");
		
		Customer customer = new Customer();
		customer.setCustomerName("Vaaaarun");
		customer.setEmail("Vaarun@gmail.com");
		customer.setMobile(8762515928l);
		customer.setAddress(address);
		
		CustomerService customerService =new CustomerServiceImpl();
		System.out.println(customerService.createCustomer(customer));
		
		
		

	}

}
