package springannotations.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("address")
public class Address{
	private String city;
	private String state;
	private String country;
	@Autowired
	private Integer addressId;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Address(String city, String state, String country, Integer addressId) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.addressId = addressId;
	}
	public Address() {
		super();
	}

}
