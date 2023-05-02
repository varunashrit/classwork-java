package jpaproduct.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import jpaproduct.entities.Customer;
import jpaproduct.entities.Order;
import jpaproduct.entities.Product;
import jpaproduct.service.CustomerService;
import jpaproduct.service.CustomerServiceImpl;
import jpaproduct.service.OrderService;
import jpaproduct.service.OrderServiceImpl;
import jpaproduct.service.ProductService;
import jpaproduct.service.ProductServiceImpl;

public class OrderMain {

	public static void main(String[] args) {
		Customer cust1= new Customer(1l, "Stefan Walker", 1, null);
		Customer cust2 = new Customer(2l, "Daija Von", 1, null);
		Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1, null);
		Customer cust4 = new Customer(4l, "Marques Nikolaus", 2,null);
		Customer cust5 = new  Customer(5l, "Rachelle Greenfelder", 0,null);
		Customer cust6 = new Customer(6l, "Larissa White", 2, null);
		Customer cust7 = new Customer(7l, "Fae Heidenreich", 1, null);
		Customer cust8 = new Customer(8l, "Dino Will", 2,null);
		Customer cust9 = new Customer(9l, "Eloy Stroman", 1,null);
		Customer cust10 = new Customer(10l, "Brisa O''Connell", 1,null);
		
		List<Customer> Customers = new ArrayList<>();
		Customers.add(cust1);
		Customers.add(cust2);
		Customers.add(cust3);
		Customers.add(cust4);
		Customers.add(cust5);
		Customers.add(cust6);
		Customers.add(cust7);
		Customers.add(cust8);
		Customers.add(cust9);
		Customers.add(cust10);
		
		Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
		Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
		Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
		Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5 = new Product(5l, "animi cum rem", "Game", 458.20);
		Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
		Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
		Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
		Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
		Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
		Product prod11 = new Product(11l, "laudantium sit nihil", "Toys", 95.50);
		Product prod12 = new Product(12l, "ut perferendis corporis", "Grocery", 302.19);
		Product prod13 = new Product(13l, "sint voluptatem ut", "Toys", 295.37);
		Product prod14= new Product(14l, "quos sunt ipsam", "Grocery", 534.64);
		Product prod15 = new Product(15l, "qui illo error", "Baby", 623.58);
		Product prod16 = new Product(16l, "aut ex ducimus","Books", 551.39);
		Product prod17 = new Product(17l, "accusamus repellendus minus", "Books", 240.58);
		Product prod18 = new Product(18l, "aut accusamus quia", "Baby", 881.38);
		Product prod19 = new Product(19l, "doloremque incidunt sed", "Game", 988.49);
		Product prod20 = new Product(20l, "libero omnis velit", "Baby", 177.61);
		Product prod21 = new Product(21l, "consectetur cupiditate sunt", "Toys", 95.46);
		Product prod22 = new Product(22l, "itaque ea qui", "Baby", 677.78);
		Product prod23 = new Product(23l, "non et nulla", "Grocery", 70.49);
		Product prod24 = new Product(24l, "veniam consequatur et", "Books", 893.44);
		Product prod25 = new Product(25l, "magnam adipisci voluptate", "Grocery", 366.13);
		Product prod26 = new Product(26l, "reiciendis consequuntur placeat", "Toys", 359.27);
		Product prod27 = new Product(27l, "dolores ipsum sit", "Toys", 786.99);
		Product prod28 = new Product(28l, "ut hic tempor", "Toys", 316.09);
		Product prod29 = new Product(29l, "quas quis deserunt", "Toys", 772.78);
		Product prod30 = new Product(30l, "excepturi nesciunt accusantium", "Toys", 911.46);
		
		List<Product> productList1 = new ArrayList<>();
		productList1.add(prod1);
		productList1.add(prod2);
		productList1.add(prod3);
		productList1.add(prod4);
		productList1.add(prod5);
		productList1.add(prod6);
		productList1.add(prod7);
		productList1.add(prod8);
		productList1.add(prod9);
		productList1.add(prod10);
		
		List<Product> productList2 = new ArrayList<>();
		productList2.add(prod11);
		productList2.add(prod12);
		productList2.add(prod13);
		productList2.add(prod14);
		productList2.add(prod15);
		productList2.add(prod16);
		productList2.add(prod17);
		productList2.add(prod18);
		productList2.add(prod19);
		productList2.add(prod20);
		
		List<Product> productList3 = new ArrayList<>();
		productList3.add(prod21);
		productList3.add(prod22);
		productList3.add(prod23);
		productList3.add(prod24);
		productList3.add(prod25);
		productList3.add(prod26);
		productList3.add(prod27);
		productList3.add(prod28);
		productList3.add(prod29);
		productList3.add(prod30);
		
//		List<Product> productlist = new ArrayList<Product>();
//		productlist.add(prod1);
//		productlist.add(prod2);
//		productlist.add(prod3);
//		productlist.add(prod4);
//		productlist.add(prod5);
//		productlist.add(prod6);
//		productlist.add(prod7);
//		productlist.add(prod8);
//		productlist.add(prod9);
//		productlist.add(prod10);
//		productlist.add(prod11);
//		productlist.add(prod12);
//		productlist.add(prod13);
//		productlist.add(prod14);
//		productlist.add(prod15);
//		productlist.add(prod16);
//		productlist.add(prod17);
//		productlist.add(prod18);
//		productlist.add(prod19);
//		productlist.add(prod20);
//		productlist.add(prod21);
//		productlist.add(prod22);
//		productlist.add(prod23);
//		productlist.add(prod24);
//		productlist.add(prod25);
//		productlist.add(prod26);
//		productlist.add(prod27);
//		productlist.add(prod28);
//		productlist.add(prod29);
//		productlist.add(prod30);
		
		
		Order o1 = new Order(1, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-08"), "NEW", productList1, cust5);
		Order o2 = new Order(2, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-05"), "NEW", productList1, cust3);
		Order o3 = new Order(3, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-18"), "DELIVERED", productList1, cust5);
		Order o4 = new Order(4, LocalDate.parse("2021-03-22"), LocalDate.parse("2021-03-27"), "PENDING", productList1, cust3);
		Order o5 = new Order(5, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-12"), "NEW", productList1, cust1);
		Order o6 = new Order(6, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "DELIVERED", productList1, cust9);
		Order o7 = new Order(7, LocalDate.parse("2021-03-05"), LocalDate.parse("2021-03-09"), "PENDING", productList1, cust8);
		Order o8 = new Order(8, LocalDate.parse("2021-03-27"), LocalDate.parse("2021-04-05"), "NEW", productList1, cust4);
		Order o9 = new Order(9, LocalDate.parse("2021-04-14"), LocalDate.parse("2021-04-18"), "NEW", productList1, cust10);
		Order o10 = new Order(10, LocalDate.parse("2021-03-10"), LocalDate.parse("2021-03-19"), "NEW", productList1, cust8);
		Order o11 = new Order(11, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-04"), "DELIVERED", productList1, cust1);
		Order o12 = new Order(12, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-28"), "PENDING", productList1, cust5);
		Order o13 = new Order(13, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-21"), "NEW", productList1, cust5);
		Order o14 = new Order(14, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "PENDING", productList1, cust4);
		Order o15 = new Order(15, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-14"), "DELIVERED", productList1, cust5);
		Order o16 = new Order(16, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-21"), "NEW", productList1, cust1);
		Order o17 = new Order(17, LocalDate.parse("2021-03-31"), LocalDate.parse("2021-03-31"), "DELIVERED", productList1, cust6);
		Order o18 = new Order(18, LocalDate.parse("2021-03-25"), LocalDate.parse("2021-03-31"), "PENDING", productList1, cust9);
		Order o19 = new Order(19, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-09"), "DELIVERED", productList2, cust9);
		Order o20 = new Order(20, LocalDate.parse("2021-03-23"), LocalDate.parse("2021-03-30"), "NEW", productList2, cust5);
		Order o21 = new Order(21, LocalDate.parse("2021-03-19"), LocalDate.parse("2021-03-24"), "DELIVERED", productList2, cust9);
		Order o22 = new Order(22, LocalDate.parse("2021-02-27"), LocalDate.parse("2021-03-01"), "NEW", productList2, cust5);
		Order o23 = new Order(23, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-24"), "PENDING", productList2, cust4);
		Order o24 = new Order(24, LocalDate.parse("2021-03-24"), LocalDate.parse("2021-03-24"), "DELIVERED", productList2, cust1);
		Order o25 = new Order(25, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-10"), "NEW", productList2, cust1);
		Order o26 = new Order(26, LocalDate.parse("2021-03-17"), LocalDate.parse("2021-03-26"), "NEW", productList2, cust10);
		Order o27 = new Order(27, LocalDate.parse("2021-03-20"), LocalDate.parse("2021-03-25"), "NEW", productList2, cust1);
		Order o28 = new Order(28, LocalDate.parse("2021-04-09"), LocalDate.parse("2021-04-16"), "DELIVERED", productList2, cust2);
		Order o29 = new Order(29, LocalDate.parse("2021-04-06"), LocalDate.parse("2021-04-08"), "PENDING", productList2, cust1);
		Order o30 = new Order(30, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-20"), "DELIVERED", productList2, cust1);
		Order o31 = new Order(31, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-04"), "NEW", productList2, cust3);
		Order o32 = new Order(32, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-24"), "DELIVERED", productList2, cust2);
		Order o33 = new Order(33, LocalDate.parse("2021-04-18"), LocalDate.parse("2021-04-24"), "PENDING", productList2, cust1);
		Order o34 = new Order(34, LocalDate.parse("2021-03-28"), LocalDate.parse("2021-03-28"), "NEW", productList2, cust6);
		Order o35 = new Order(35, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-17"), "NEW", productList3, cust1);
		Order o36 = new Order(36, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-08"), "DELIVERED", productList3, cust2);
		Order o37 = new Order(37, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-25"), "NEW", productList3, cust8);
		Order o38 = new Order(38, LocalDate.parse("2021-04-11"), LocalDate.parse("2021-04-20"), "NEW", productList3, cust8);
		Order o39 = new Order(39, LocalDate.parse("2021-04-12"), LocalDate.parse("2021-04-17"), "NEW", productList3, cust9);
		Order o40 = new Order(40, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-12"), "PENDING", productList3, cust3);
		Order o41 = new Order(41, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-26"), "NEW", productList3, cust5);
		Order o42 = new Order(42, LocalDate.parse("2021-04-08"), LocalDate.parse("2021-04-14"), "DELIVERED", productList3, cust9);
		Order o43 = new Order(43, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-11"), "NEW", productList3, cust3);
		Order o44 = new Order(44, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-14"), "DELIVERED", productList3, cust4);
		Order o45 = new Order(45, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-06"), "DELIVERED", productList3, cust1);
		Order o46 = new Order(46, LocalDate.parse("2021-03-16"), LocalDate.parse("2021-03-22"), "NEW", productList3, cust10);
		Order o47 = new Order(47, LocalDate.parse("2021-04-07"), LocalDate.parse("2021-04-12"), "PENDING", productList3, cust2);
		Order o48 = new Order(48, LocalDate.parse("2021-04-05"), LocalDate.parse("2021-04-06"), "NEW", productList3, cust2);
		Order o49 = new Order(49, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-13"), "NEW", productList3, cust7);
		Order o50 = new Order(50, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-21"), "NEW", productList3, cust9);
		
//		List<Order> orderList = new ArrayList<Order>();
//		orderList.add(o1);
//		orderList.add(o2);
//		orderList.add(o3);
//		orderList.add(o4);
//		orderList.add(o5);
//		orderList.add(o6);
//		orderList.add(o7);
//		orderList.add(o8);
//		orderList.add(o9);
//		orderList.add(o10);
//		orderList.add(o11);
//		orderList.add(o12);
//		orderList.add(o13);
//		orderList.add(o14);
//		orderList.add(o15);
//		orderList.add(o16);
//		orderList.add(o17);
//		orderList.add(o18);
//		orderList.add(o19);
//		orderList.add(o20);
//		orderList.add(o21);
//		orderList.add(o22);
//		orderList.add(o23);
//		orderList.add(o24);
//		orderList.add(o25);
//		orderList.add(o26);
//		orderList.add(o27);
//		orderList.add(o28);
//		orderList.add(o29);
//		orderList.add(o30);
//		orderList.add(o31);
//		orderList.add(o32);
//		orderList.add(o33);
//		orderList.add(o34);
//		orderList.add(o35);
//		orderList.add(o36);
//		orderList.add(o37);
//		orderList.add(o38);
//		orderList.add(o39);
//		orderList.add(o40);
//		orderList.add(o41);
//		orderList.add(o42);
//		orderList.add(o43);
//		orderList.add(o44);
//		orderList.add(o45);
//		orderList.add(o46);
//		orderList.add(o47);
//		orderList.add(o47);
//		orderList.add(o48);
//		orderList.add(o49);
//		orderList.add(o50);
		
		OrderService os = new OrderServiceImpl();
		ProductService ps = new ProductServiceImpl();
		CustomerService cs = new CustomerServiceImpl();
		
		// Persisting into the Database
		
		System.out.println(os.createOrder(o1));
		os.createOrder(o2);
		os.createOrder(o3);
		os.createOrder(o4);
		os.createOrder(o5);
		os.createOrder(o6);
		os.createOrder(o7);
		os.createOrder(o8);
		os.createOrder(o9);
		os.createOrder(o10);
		os.createOrder(o11);
		os.createOrder(o12);
		os.createOrder(o13);
		os.createOrder(o14);
		os.createOrder(o15);
		os.createOrder(o16);
		os.createOrder(o17);
		os.createOrder(o18);
		os.createOrder(o19);
		os.createOrder(o20);
		os.createOrder(o21);
		os.createOrder(o22);
		os.createOrder(o23);
		os.createOrder(o24);
		os.createOrder(o25);
		os.createOrder(o26);
		os.createOrder(o27);
		os.createOrder(o28);
		os.createOrder(o29);
		os.createOrder(o30);
		os.createOrder(o31);
		os.createOrder(o32);
		os.createOrder(o33);
		os.createOrder(o34);
		os.createOrder(o35);
		os.createOrder(o36);
		os.createOrder(o37);
		os.createOrder(o38);
		os.createOrder(o39);
		os.createOrder(o40);
		os.createOrder(o41);
		os.createOrder(o42);
		os.createOrder(o43);
		os.createOrder(o44);
		os.createOrder(o45);
		os.createOrder(o46);
		os.createOrder(o47);
		os.createOrder(o48);
		os.createOrder(o49);
		os.createOrder(o50);
		
		List<Order> orderList = os.getOrders();
		List<Product> productsList = ps.getAllProducts();
		List<Customer> customerList = cs.getAllCustomers();
		
		List<Product> bookList = productsList.stream().filter(p -> p.getCategory().equals("Books"))
		  .filter(p -> p.getPrice() > 100)
		  .collect(Collectors.toList());
		
		List<Order> babyOrders = orderList.stream()
				  .filter(o -> o.getProducts().stream()
				  .anyMatch(p -> p.getCategory().equals("Baby")))
				  .collect(Collectors.toList());
		
		List<Product> discountedToys = productsList.stream()
			    .filter(p -> p.getCategory().equals("Toys"))
			    .peek(p -> p.setPrice(p.getPrice() * 0.9))
			    .collect(Collectors.toList());
		
		List<Product> Tier2Customers = orderList.stream()
			    .filter(o -> o.getCustomer().getTier() == 2)
			    .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2021, Month.FEBRUARY, 1)) 
			                && o.getOrderDate().isBefore(LocalDate.of(2021, Month.APRIL, 1)))
			    .flatMap(o -> o.getProducts().stream())
			    .distinct()
			    .collect(Collectors.toList());
		
		Product cheapestBook = productsList.stream()
			    .filter(p -> p.getCategory().equals("Books"))
			    .min(Comparator.comparingDouble(Product::getPrice))
			    .orElse(null);
		
		System.out.println(bookList);
		System.out.println(babyOrders);
		System.out.println(discountedToys);
		System.out.println(Tier2Customers);
		System.out.println(cheapestBook);
		



		
	}

}
