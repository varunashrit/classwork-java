package day8ExercisesSubtractDivide;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SwapProblem {
	public static void main(String[] args) {
        List list=new ArrayList();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(14);
		list.add(16);
		list.add(18);
		System.out.println("Swap for 3,1 index");
		System.out.println("List before swaped");
		System.out.println(list);
		
		swap(list,3,1);
		System.out.println("List after swaped");
		System.out.println(list);
		
		
		System.out.println("Swap for 8,2 index");
		System.out.println(list);
		swap(list,8,2);
	}
	
public static void swap(List T, int firstPos, int secondPos) throws IndexOutOfBoundsException{
	try {
	Collections.swap(T, firstPos, secondPos);
	}catch(IndexOutOfBoundsException e) {
        System.out.println("Index out of bounds length");
    }
	
}
}
