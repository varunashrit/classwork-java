package jpaassociationandmapping.inheritance.tpc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TPCMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
		EmployeeTPC e1 = new EmployeeTPC();
		e1.setName("Lucifer");
		e1.setSalary(67865.50);
		
		ManagerTPC m1 =new ManagerTPC();
		m1.setDepartmentName("Accounts");
		m1.setName("Nikhil");
		m1.setSalary(123456.00);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(m1);
		em.getTransaction().commit();


	}

}
