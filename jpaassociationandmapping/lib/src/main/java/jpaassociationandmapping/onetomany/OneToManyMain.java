package jpaassociationandmapping.onetomany;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyMain {

	public static void main(String[] args) {
		

		Department department = new Department();
		department.setDeptName("Marketing");
		department.setLocation("New Delhi");

		Department department1 = new Department();
		department1.setDeptName("IT");
		department1.setLocation("Bengaluru");
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Varun Bhai");
		emp1.setHireDate(LocalDate.of(2022, 12, 22));
		emp1.setDepartment(department1);

		Employee emp2 = new Employee();
		emp2.setEmpName("Tony Bhai");
		emp2.setHireDate(LocalDate.of(2022, 12, 20));
		emp2.setDepartment(department1);

		Employee emp4 = new Employee();
		emp4.setEmpName("Gokul Bhai");
		emp4.setHireDate(LocalDate.of(2022, 11, 25));
		emp4.setDepartment(department);

		Employee emp3 = new Employee();
		emp3.setEmpName("Karthick bhai");
		emp3.setHireDate(LocalDate.of(2021, 10, 19));
		emp3.setDepartment(department1);
		Set<Employee> empdept1= new HashSet<Employee>(); 
		empdept1.add(emp3);
		empdept1.add(emp1);
		empdept1.add(emp2);
		
		Set<Employee> empdept= new HashSet<Employee>(); 
		empdept.add(emp4);
		
		department1.setEmployees(empdept1);
		department.setEmployees(empdept);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		
		em.getTransaction().commit();


	}

}
