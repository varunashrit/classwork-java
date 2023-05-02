package jpaassociationandmapping.bi;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationandmapping.onetoone.Address;
import jpaassociationandmapping.onetoone.Student;

public class OneToOneBiMain {
	public static void main(String[] args) {
		Student student1 =new Student();
		Address houseAddress1 = new Address();
		
		student1.setName("Tony Stark");
		student1.setDateOfBirth(LocalDate.of(3000,  01, 07));
		
		student1.setCity("Gokak");
		student1.setCountry("India");
		student1.setStreet("Killa");
		student1.setPincode(123400);
		
		student1.setAddress(houseAddress1);
		
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em1 = emf1.createEntityManager();
		em1.getTransaction().begin();
		em1.persist(student1);
		em1.getTransaction().commit();
		
	}
}
