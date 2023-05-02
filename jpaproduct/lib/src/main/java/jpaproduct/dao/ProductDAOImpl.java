package jpaproduct.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpaproduct.entities.Product;

public class ProductDAOImpl implements ProductDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaproduct");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Product createProduct(Product product) {
		em.getTransaction().begin();
		if(em.contains(product)) {
			em.merge(product);
		} else {
			em.persist(product);
		}
		em.getTransaction().commit();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		em.getTransaction().begin();
		Query query = em.createQuery("select p from Product p");
		List<Product> allProducts = query.getResultList();
		em.getTransaction().commit();
		return allProducts;
	}


}
