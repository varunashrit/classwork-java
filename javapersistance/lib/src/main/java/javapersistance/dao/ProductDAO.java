package javapersistance.dao;

import javapersistance.entities.Product;

public interface ProductDAO {
	//Create
	public Product createProduct(Product product);
	//Retrieve
	public Product retrieveProduct(Integer productId);
	//Update
	public Product updateProduct(Product product);
	//Delete
	public void deleteProduct(Product product);
//	Delete by id
	public void deleteProductById(Integer productId);
}