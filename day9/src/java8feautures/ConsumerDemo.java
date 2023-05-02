package java8feautures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<String> consumer = (s)-> System.out.println(s);
	consumer.accept("Karthik Bro");
	
	
	List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
	Consumer<Integer> consumers = (Integer x)-> System.out.println(x);
	for(Integer n: listOfInteger) {
		consumers.accept(n);
	}
	System.out.println("**********HIGH ORDER INTERFACE___________");
	displayInfo(listOfInteger, consumers);
	System.out.println("----------HIGHER ORDER FUNC FOR-EACH---");
	listOfInteger.forEach((Integer x)-> System.out.println(x)) ;
	System.out.println("--------------------------------");
	displayInfo(listOfInteger, (Integer x)-> System.out.println(x));
	
}
	public static <T> void displayInfo(List<T> list, Consumer<T> consumers) {
		for (T t : list) {
			consumers.accept(t);
		}
	}
}
