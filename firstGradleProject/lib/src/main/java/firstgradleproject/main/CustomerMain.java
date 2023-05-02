package firstgradleproject.main;

import firstgradleproject.data.Customer;
import firstgradleproject.data.Address;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.getAddress();
		customer.getEmail();
		System.out.println(customer.getMobile());
		
		
	}

}
