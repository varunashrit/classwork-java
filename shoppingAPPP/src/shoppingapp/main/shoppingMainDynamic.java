package shoppingapp.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import shoppingAPPP.data.Customer;
import shoppingAPPP.data.Order;
import shoppingAPPP.data.Product;

public class shoppingMainDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("************Welcome to Shopping App**************");
        System.out.println("**********Enter product details *******************");
        System.out.println("*****How many products you want to add?*************");
        
        int numOfProductsToBeadded = sc.nextInt();
        int counter=0;
        List<Product> productList = new ArrayList<Product>();
        
        do {
        	System.out.println("-----enter product details----");
        	System.out.println("enter product id");
            
        	Long id = sc.nextLong();
            sc.nextLine();
            
            System.out.println("enter name product");
            String name = sc.next();
            
            System.out.println("enter category of product");
            String category = sc.next();
            
            System.out.println("enter price product");
            Double price = sc.nextDouble();
            sc.nextLine();
            
            Product prod = new Product();
            prod.setId(id);
            prod.setName(name);
            prod.setCategory(category);
            prod.setPrice(price);

            //Storing it in list
            productList.add(prod);
            counter++;

        }while(counter < numOfProductsToBeadded);
        System.out.println(productList);
        
        System.out.println("---Enter the details of the customer--------");
        
        System.out.println("=====Enter cust id======");
        Long custId =  sc.nextLong();
        sc.nextLine();
        
        System.out.println("''''''Enter cust name''''''");
        String custName = sc.nextLine();
        
        System.out.println("Enter cust teir");
        Integer Tier = sc.nextInt();
        sc.nextLine();
        
        Customer customer = new Customer();
        customer.setId(custId);
        customer.setName(custName);
        customer.setTier(Tier);
        
        System.out.println("Enter order details");
        System.out.println("Enter order id");
        
        Long orderId = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter order status");
        String status = sc.nextLine();
        
        Order order = new Order();
		order.setId(orderId);
		order.setStatus("Placed");
		order.setOrderDate(LocalDate.now());
		order.setDeliveryDate(LocalDate.now().plusDays(1));
		order.setProducts(productList);
		order.setCustomer(customer);
		
		System.out.println("Order Details -----------------------------"+order);
        

    }

 

}
		