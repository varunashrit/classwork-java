package javapersistance.service;



import javapersistance.dao.ProductDAOImpl;
import javapersistance.entities.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDAOImpl pdao=new ProductDAOImpl();
//	ProducDAO pdaoo = new ProductDAO();
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
	
		return pdao.createProduct(product);
	}
	@Override
	public Product retrieveProduct(Integer productId) {
		return pdao.retrieveProduct(productId);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Product product) {
		pdao.deleteProduct(product);
	}

	@Override
	public void deleteProductById(Integer productId) {
		// TODO Auto-generated method stub
		pdao.deleteProductById(productId);
	}

}
