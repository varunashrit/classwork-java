package com.orderproc.service;

import java.util.List;

import com.orderproc.exception.ProductNotFoundException;
import com.orderproc.model.Product;

public interface ProductService {
	public Product addProduct(Product product ) ;
	public Product updateProduct(Product product ) throws ProductNotFoundException;
	public Product deleteProduct (int productid) throws ProductNotFoundException;
	public Product viewProduct(int productid) throws ProductNotFoundException;
	public List<Product> viewAllProducts();
}
