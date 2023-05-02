package javapersistance.main;

import javapersistance.entities.Product;
import javapersistance.service.ProductService;
import javapersistance.service.ProductServiceImpl;

public class ProductMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductName("Google Pixel");
		product.setDescription("Google android phone");
		product.setPrice(3456.77);
		product.setQuantity(7);
		
		System.out.println("------Product befor inserting into db---");
		System.out.println(product);
		
		ProductService productService = new ProductServiceImpl();
//		productService.createProduct(product);
//		System.out.println("");
//		System.out.println("");
//		System.out.println("-=-=-=-=-after inserting in DB=-=-=-");
//		System.out.println(product);
		productService.deleteProduct(product);
		Product product1 = new Product();
		product.setProductName("iPone 14 Pro Max");
		product.setDescription("uxurious mobile phone");
		product.setPrice(155555.50);
		product.setQuantity(5);
		productService.createProduct(product1);
		productService.deleteProduct(product1);

		

	}

}
