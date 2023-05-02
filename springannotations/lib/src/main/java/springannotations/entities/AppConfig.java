package springannotations.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name ="customer")
	public Customer createCustomer(){
		return new Customer();
	}
	
	@Bean(name="person")
	public Person createPerson(){
		return new Person();
	}
	
	@Bean(name="addressBean1")
	public Address createResidentialAddress(){
		return new Address("IN","BLR","KA",1);
	}
	
	@Bean(name="addressBean2")
	public Address createPermanentAddress(){
		return new Address("IN","MYS","KA",2);
	}
}




