package javapersistance.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javapersistance.entities.Product;

public class ProductDAOImpl implements ProductDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("javapersistance");

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
		return product;
	}

	@Override
	public Product retrieveProduct(Integer productId) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Product product = em.find(Product.class, productId);
		em.getTransaction().commit();
		return product;

	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Product prod =em.find(Product.class, product.getProductId());
		if(prod!=null) {
			prod.setDescription(product.getDescription());
			prod.setPrice(product.getPrice());
			prod.setProductName(product.getProductName());
			prod.setQuantity(product.getQuantity());
			em.persist(prod);
		}else {
			System.out.println("Product not found");
		}
		em.getTransaction().commit();
		return product;

	}

	@Override
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductById(Integer productId) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Product prod = em.find(Product.class, productId);
		if(prod !=null) {
			em.remove(prod);
		}
		else {
            System.out.println("Product with productId---"+productId+" doesn't exist in the database");
        }
        em.getTransaction().commit();
		
	}
	

}
