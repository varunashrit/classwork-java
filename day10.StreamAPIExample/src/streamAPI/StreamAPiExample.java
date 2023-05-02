package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPiExample {
	public static void main(String[] args) {
//		Lets create a stream
		Stream <Integer> intStream = Stream.of(10,20,30);
//		System.out.println(intStream);
//	These are terminal operations of so they
//		can be used only once and after 
//		they are executed they will be closed automatically 
//		as they can use the data only once. It also doesnt store the data
		
//		System.out.println(intStream.count());
//		System.out.println(intStream.toList()); 
//		System.out.println(intStream.toArray());
		List<Integer> newList = intStream.filter(x->x<30).toList();
		System.out.println(newList);
		
		Integer[] values = new Integer[] {20,30,40,50};
		Stream<Integer> streamValues = Arrays.stream(values);
		System.out.println(streamValues.count());
		
		List<String> listOfString = new ArrayList();
		listOfString.add("varun");
		listOfString.add("Good");
		listOfString.add("Morning");
		listOfString.add("EVeryone");
		Stream<String> strm = listOfString.stream();
		Stream<String> str = strm.filter(x->x.equals("varun"));
		
		System.out.println("The String stream is :"+str.count());
		
		System.out.println("*********************************");
		
		List<Integer> listOfNumbers = Arrays.asList(17,18,19,1,2,11,12,13,14,15,3,4,5,16,20,21,22,23,24,25,26);
//		listOfNumbers
//		.stream()
//		.filter(num->num>18)
//		.skip(5)//skips first 5 elements
//		.limit(5)//limits to only 5 elements
//		.forEach(System.out::println);
		System.out.println("--------------------------------------------");
		
		Stream<Integer> streans = listOfNumbers.stream();
		Stream<Integer> strmm = streans.filter(num->num<20);
////		
//		strmm.forEach(System.out::println);
		Stream<Integer> stm = strmm.limit(5);
		stm.forEach(System.out::println);
		
		System.out.println("------------------Sorted------------------------");
		List<Integer> sortedList =listOfNumbers.stream()
		.sorted()
		.toList();
		sortedList.forEach(System.out::println);
		System.out.println("------------------Reverse Sorted------------------------");
		listOfNumbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
 		
	}

}
