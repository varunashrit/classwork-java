package collectionsExample.vector;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
//		Vector uses a dynamic array to store the data elements.
//		It is similar to ArrayList.
//		It is synchronized and contains many meythods that are not part
//		collection framework
//		Default size of vector is 10
		List<Integer> vect = new Vector<Integer>();
		System.out.println("-----------Vector---------------");
		System.out.println(vect.size());
//		System.out.println();
		vect.add(1);
		vect.add(22);
		vect.add(23);
		vect.add(24);
		vect.add(4, 16);
		
		for (Integer intNum: vect ) {
			System.out.println(intNum);
		}
		System.out.println("-----------Stack-------------");
		
		Stack<Double> stk = new Stack<Double>();
		System.out.println(stk.size());
		stk.push(111.00);
		stk.push(112.00);
		stk.push(113.00);
		stk.push(114.00);
		
		System.out.println("------------USing for loop-------------");
		for (Double n: stk) {
			System.out.println(n);
		}
		
		System.out.println(stk);
		System.out.println("-----------Using pop---------------");
		stk.pop();
		System.out.println(stk);
		System.out.println("-----------Using iterator---------------");
		Iterator itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------Pushing an array in stack----------");
		Integer[] arrIntegerName= {6,7,8,9,10};
		Stack stk1 = new Stack();
		stk1.push(arrIntegerName);
		stk1.push("Stack is cooler then vector");
		stk1.push(134122);
		System.out.println(stk1);
		for (int i=0;i<((Integer[])stk1.get(0)).length; i++){
			System.out.println(((Integer[])stk1.get(0))[i]);
		}
		System.out.println("^^^^^^^^^^without type casting in for loop^^^^^^^^^^^^^^^");
		Integer[] iNum = (Integer[])stk1.get(0);
		for (int i =0;i<iNum.length;i++) {
			System.out.println(iNum[i]);
		}
		stk1.forEach(System.out::println);
	}
}
