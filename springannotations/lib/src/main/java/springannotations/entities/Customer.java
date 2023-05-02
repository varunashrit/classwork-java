package springannotations.entities;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	private Integer customerId;
	private String name;
	
	private Address address;
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(Address address) {
		super();
		this.address = address;
	}
	public Customer(Integer customerId, String name, Address address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	public Customer() {
		super();
	}
	
	

}
