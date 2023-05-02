package shoppingapp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import shoppingappData.Customer;
import shoppingappData.Order;
import shoppingappData.Product;

public class shoppingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1= new Customer();
		Customer cust2 = new Customer(11l,"Ram",277);
//		System.out.println(cust1);
		System.out.println(cust2);
		
		Product prod1 = new Product();
		Product prod2 = new Product();
		Product prod3 = new Product();
		Product prod4 = new Product();
		
		prod1.setCategory("laptop");
		prod1.setId(25l);
		prod1.setName("Lenovo");
		prod1.setPrice(23556.77);
		
		prod2.setCategory("smart phone");
		prod2.setId(26l);
		prod2.setName("Moto");
		prod2.setPrice(10556.77);
		
		prod3.setCategory("speaker");
		prod3.setId(27l);
		prod3.setName("JBL");
		prod3.setPrice(1556.77);
		
		prod4.setId(28l);
		prod4.setName("Samsung Galaxy S6");
		prod4.setCategory("Mobile Phone");
		prod4.setPrice(166552.00);
		
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(prod1);
		productlist.add(prod2);
		productlist.add(prod3);
		productlist.add(prod4);
		
		
		Order order1 = new Order();
		order1.setId(21l);
		order1.setStatus("dispatched");
		order1.setOrderDate(LocalDate.now());
		order1.setDeliveryDate(LocalDate.now().plusDays(2));
		order1.setProducts(productlist);
		order1.setCustomer(cust2);
		System.out.println(order1);
	}

}
