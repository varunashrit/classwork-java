package jpaassociationandmapping.inheritance.stc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class STCMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
		EmployeeSTC e1 = new EmployeeSTC();
		e1.setName("Gwen");
		e1.setSalary(67865.50);
		
		ManagerSTC m1 =new ManagerSTC();
		m1.setDepartmentName("Accounts");
		m1.setName("Varun");
		m1.setSalary(123456.00);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(m1);
		em.getTransaction().commit();

	}

}
