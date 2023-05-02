package jpaassociationandmapping.manytomany;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationandmapping.manytomany.Order;
import jpaassociationandmapping.manytomany.Product;

public class ManytoManyMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		Order o1 = new Order();
		o1.setOrderDate(LocalDate.now());
		Order o2 = new Order();
		o2.setOrderDate(LocalDate.now());

		Product p1 = new Product();
		p1.setProductName("Lenovo Thinkpad Max");
		p1.setPrice(135600.00);
		Product p2 = new Product();
		p2.setProductName("Macbook");
		p2.setPrice(125600.00);
		Set<Product> productSet1 = new HashSet<Product>();
		productSet1.add(p1);
		productSet1.add(p2);
		o1.setProducts(productSet1);

		Set<Product> productSet2 = new HashSet<Product>();
		productSet2.add(p1);
		productSet2.add(p2);
		o2.setProducts(productSet2);
		// Order is the owning entity
		em.getTransaction().begin();
		em.persist(o1);
		em.persist(o2);
		em.getTransaction().commit();
	}

}

