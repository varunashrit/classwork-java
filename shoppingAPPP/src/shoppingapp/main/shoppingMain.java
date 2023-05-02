package shoppingapp.main;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import shoppingAPPP.data.*;


public class shoppingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1= new Customer(1l, "Stefan Walker", 1);
		Customer cust2 = new Customer(2l, "Daija Von", 1);
		Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1);
		Customer cust4 = new Customer(4l, "Marques Nikolaus", 2);
		Customer cust5 = new  Customer(5l, "Rachelle Greenfelder", 0);
		Customer cust6 = new Customer(6l, "Larissa White", 2);
		Customer cust7 = new Customer(7l, "Fae Heidenreich", 1);
		Customer cust8 = new Customer(8l, "Dino Will", 2);
		Customer cust9 = new Customer(9l, "Eloy Stroman", 1);
		Customer cust10 = new Customer(10l, "Brisa O''Connell", 1);
		
		Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
		Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
		Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
		Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5 = new Product(5l, "animi cum rem", "Games", 458.20);
		Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
		Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
		Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
		Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
		Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
		Product prod11= new Product(11l, "laudantium sit nihil", "Toys", 95.50);
		Product prod12 = new Product(12l, "ut perferendis corporis", "Grocery", 302.19);
		Product prod13= new Product(13l, "sint voluptatem ut", "Toys", 295.37);
		Product prod14= new Product(14l, "quos sunt ipsam", "Grocery", 534.64);
		Product prod15= new Product(15l, "qui illo error", "Baby", 623.58);
		Product prod16= new Product(16l, "aut ex ducimus", "Books", 551.39);
		Product prod17= new Product(17l, "accusamus repellendus minus", "Books", 240.58);
		Product prod18= new Product(18l, "aut accusamus quia", "Baby", 881.38);
		Product prod19= new Product(19l, "doloremque incidunt sed", "Games", 988.49);
		Product prod20= new Product(20l, "libero omnis velit", "Baby", 177.61);
		Product prod21= new Product(21l, "consectetur cupiditate sunt", "Toys", 95.46);
		Product prod22= new Product(22l, "itaque ea qui", "Baby", 677.78);
		Product prod23= new Product(23l, "non et nulla", "Grocery", 70.49);
		Product prod24= new Product(24l, "veniam consequatur et", "Books", 893.44);
		Product prod25= new Product(25l, "magnam adipisci voluptate", "Grocery", 366.13);
		Product prod26= new Product(26l, "reiciendis consequuntur placeat", "Toys", 359.27);
		Product prod27= new Product(27l, "dolores ipsum sit", "Toys", 786.99);
		Product prod28= new Product(28l, "ut hic tempore", "Toys", 316.09);
		Product prod29= new Product(29l, "quas quis deserunt", "Toys", 772.78);
		Product prod30= new Product(30l, "excepturi nesciunt accusantium", "Toys", 911.46);
		
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(prod1);
		productlist.add(prod2);
		productlist.add(prod3);
		productlist.add(prod4);
		productlist.add(prod5);
		productlist.add(prod6);
		productlist.add(prod7);
		productlist.add(prod8);
		productlist.add(prod9);
		productlist.add(prod10);
		productlist.add(prod11);
		productlist.add(prod12);
		productlist.add(prod13);
		productlist.add(prod14);
		productlist.add(prod15);
		productlist.add(prod16);
		productlist.add(prod17);
		productlist.add(prod18);
		productlist.add(prod19);
		productlist.add(prod20);
		productlist.add(prod21);
		productlist.add(prod22);
		productlist.add(prod23);
		productlist.add(prod24);
		productlist.add(prod25);
		productlist.add(prod26);
		productlist.add(prod27);
		productlist.add(prod28);
		productlist.add(prod29);
		productlist.add(prod30);
 		System.out.println(productlist);
		
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
