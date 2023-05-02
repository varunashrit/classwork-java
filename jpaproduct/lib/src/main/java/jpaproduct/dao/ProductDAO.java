package jpaproduct.dao;

import java.util.List;

import jpaproduct.entities.Product;

public interface ProductDAO {
	
	//create product in DB
	public Product createProduct(Product product);
	
	//retrieve all products
	public List<Product> getAllProducts();
}
