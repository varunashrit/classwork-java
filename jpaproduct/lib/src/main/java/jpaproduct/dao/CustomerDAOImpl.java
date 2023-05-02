package jpaproduct.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpaproduct.entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaproduct");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Customer createCustomer(Customer customer) {
		em.getTransaction().begin();
		if(em.contains(customer)) {
			em.merge(customer);
		} else {
			em.persist(customer);
		}
		em.getTransaction().commit();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		em.getTransaction().begin();
		Query query = em.createQuery("select c from Customer c");
		List<Customer> allCustomers = query.getResultList();
		em.getTransaction().commit();
		return allCustomers;
	}


}
