package java8feautures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function <String, Integer> func = x->x.length();
	Integer apply = func.apply("Varun");
	System.out.println(apply);
	System.out.println("------------------");
	
	Function<Integer, Integer> func1 = x->x*2;
	Integer result = func.andThen(func1).apply("WOW");
	System.out.println(result);
	System.out.println("-------------------");
	
	List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5,6,7,8,9);
	Function<Integer, Integer> f= x->x*2;
	Function<Integer, Integer> f2 = x->x+5;
	
	
	Integer r = f.andThen(f2).apply(5);
	System.out.println(r);
//	for(Integer t : listOfIntegers) {
//		System.out.println(r);
//	}
	
}
}
