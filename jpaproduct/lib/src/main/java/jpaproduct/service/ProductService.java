package jpaproduct.service;

import java.util.List;

import jpaproduct.entities.Product;

public interface ProductService {
	
	// create product in DB
	public Product createProduct(Product product);

	// retrieve all products
	public List<Product> getAllProducts();
}

