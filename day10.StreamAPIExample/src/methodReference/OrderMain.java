package methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderMain	 {

	public static void main(String[] args) {
		System.out.println("***********************List of order streams example******************");
		Order order1 = new Order("AUD", 15000);
		Order order2 = new Order("INR", 5000);
		Order order3 = new Order("USD", 150000);
		Order order4 = new Order("EUR", 25000);
		Order order5 = new Order("AUD", 8000);
		Order order6 = new Order("EUR", 50000);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		// Sort order on the basis of amount using custom comparator
		Collections.sort(orderList, new AmountComparator());
		System.out.println(orderList);
		System.out.println("**********************************************************");

		// getAmount method reference of Order is passed to Comparator comparing method
		Collections.sort(orderList, Comparator.comparing(Order::getAmount));
		orderList.forEach(System.out::println);

		System.out
				.println("******************************Sorting on the basis of Currency****************************");
		Collections.sort(orderList, Comparator.comparing(Order::getCurrency));
		orderList.forEach(System.out::println);

		// Static method reference example
		DisplayInformation displ = Order::displayCurrency;
		displ.display();

		// Reference to instance method
		DisplayInformation displayInfo = order1::displayAmount;
		displayInfo.display();
		
		//Reference to constructor
		OrderAmount orderAmount = Order::new;
		System.out.println(orderAmount);
		System.out.println(orderAmount.getOrderAmount(11111.1115));
	}

}

