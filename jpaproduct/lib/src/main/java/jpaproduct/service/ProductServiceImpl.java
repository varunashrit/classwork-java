package jpaproduct.service;

import java.util.List;

import jpaproduct.dao.ProductDAO;
import jpaproduct.dao.ProductDAOImpl;
import jpaproduct.entities.Product;

public class ProductServiceImpl implements ProductService {

	ProductDAO pd = new ProductDAOImpl();
	
	@Override
	public Product createProduct(Product product) {
		return pd.createProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return pd.getAllProducts();
	}


}
