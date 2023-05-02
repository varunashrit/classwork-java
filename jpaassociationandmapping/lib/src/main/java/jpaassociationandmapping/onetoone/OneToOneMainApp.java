package jpaassociationandmapping.onetoone;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneMainApp {
public static void main(String[] args) {
	Student student =new Student();
	Address houseAddress = new Address();
	
	student.setName("Varun Ashrit");
	student.setDateOfBirth(LocalDate.of(2000,  01, 07));
	
	student.setCity("Belagavi");
	student.setCountry("India");
	student.setStreet("Vadagaon");
	student.setPincode(123456);
	
	student.setAddress(houseAddress);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(student);
	em.getTransaction().commit();
	
}
}
