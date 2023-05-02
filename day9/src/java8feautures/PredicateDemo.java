package java8feautures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {
	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> collect = listOfInteger.stream().filter(x->x>5).collect(Collectors.toList());
		System.out.println(collect);
	}
}
