package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		System.out.println("---------LIST OF ORDER STREAMS------------");
		Order order1 = new Order("ARG",150000);
		Order order2 = new Order("IND",5000);
		Order order3 = new Order("USD",150000);
		Order order4 = new Order("EUR",25000);
		Order order5 = new Order("AUD",8000);
		Order order6 = new Order("EUR",50000);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		
		orderList.stream()// Creating a stream
		.filter(x->x.getAmount()>5000)//Using filter method and passing test predicate method implements
		.sorted(Comparator.comparing(Order::getAmount))
		.forEach(System.out::println);
		
		System.out.println("---------min-------------");
		System.out.println(orderList.stream()
				.filter(x->x.getCurrency().equals("EUR"))
				.min(Comparator.comparing(Order::getAmount)));
		
		System.out.println("---------max-------------");
		System.out.println(orderList.stream()
				.filter(x->x.getCurrency().equals("EUR"))
				.max(Comparator.comparing(Order::getAmount)));
		
		System.out.println("---------count-------------");
		System.out.println(orderList.stream()
				.filter(x->x.getCurrency().equals("EUR"))
				.count());
		
		System.out.println("-------------Example of Map()function on orderList-------- ");
		//using arraylist() we are creating a list of string referred by variable word
		List<String> words = Arrays.asList("Hello","Stream","Learning");
		
		//Collection list is referred by words using it we are creating
		words
		.stream()
		.map(str->str.length())
		.forEach(System.out::println);
		
		System.out.println("--------------Total of order amouint of EUR CURRENCY ----------------");
		double totalAmount = orderList.stream().filter(x->x.getCurrency().equals("EUR"))
				.map(Order::getAmount)
				.reduce(0.0, (x,y)->x+y);
		System.out.println(totalAmount);
		
		System.out.println("--------------------------");
		List<Integer> listOfInt = Arrays.asList(1,2,3,4,5);
		Integer result= listOfInt.stream().reduce(1,(x,y)->(x*y));
		System.out.println(result);
		
	}
}
