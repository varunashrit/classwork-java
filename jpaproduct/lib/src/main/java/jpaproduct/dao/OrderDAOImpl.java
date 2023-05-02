package jpaproduct.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpaproduct.entities.Order;

public class OrderDAOImpl implements OrderDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaproduct");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Order createOrder(Order order) {
		em.getTransaction().begin();
		em.merge(order);
		em.getTransaction().commit();
		return order;
	}

	@Override
	public List<Order> getOrders() {
		em.getTransaction().begin();
		Query query = em.createQuery("select o from Order o");
		List<Order> allOrders = query.getResultList();
		em.getTransaction().commit();
		return allOrders;
	}

}
