package day8ExercisesSubtractDivide;

import java.util.List;
import java.util.Vector;

/**
 * Supports arithmetic operations of +, -, *, / on any type that are subclasses
 * of {@link java.lang.Number}.
 * 
 * @author pchandra
 *
 */
public class ArithmeticOperations {
	/**
	 * Generic method to add 2 numbers.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number add(T t1, T t2) {
		return (t1.doubleValue() + t2.doubleValue());
	}

	/**
	 * Demostrates Upper Bounded Wildcards. Generic method to add numbers from a
	 * list.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number add(List<? extends Number> list) {
		double d = 0;
		
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();

		return new Double(d);
	}
	public static <t extends Number> Number sub(t t1,t t2) {
		return (t1.doubleValue()-t2.doubleValue());
	}
	
	public static <t extends Number> Number sub(List<? extends Number> list) {
		Double d=0.0;
		
		for(int index=0;index<list.size();index=index+2) {
			d+=(list.get(index).doubleValue()-list.get(index+1).doubleValue());
		}
		return d;
	}
	public static <T extends Number> Number div(T t1,T t2) {
		Double d;
		try {
			d=(t1.doubleValue()/t2.doubleValue());
		}catch(ArithmeticException e) {
			return 0;
		}
		return d;
	}
	
	public static <T extends Number> Number div(List<? extends Number> list) {
		if(list.size()==0)
			return 0;
		
		if(list.size()==1) {
			return list.get(0).doubleValue();
		}
		Double d;
		try {
			d=(list.get(0).doubleValue())/(list.get(1).doubleValue());
			for(int index=2;index<list.size();index++) {
				d=d/list.get(index).doubleValue();
			}
		}catch(ArithmeticException e) {
			return 0;
		}
		return d;
	}
	
	/**
	 * Demostrates Unbounded Wildcards. Generic method to dump list data to console.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static void dumpList(List<?> list) {
		System.out.println("List dump with unbounded wildcard:");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	public static void main(String[] args) {
		
		
// Adding 2 integers
		Integer i1 = new Integer(34), i2 = new Integer(43);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
		Float f1 = new Float(12.56), f2 = new Float(3.6778);
		System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2));
		
		
// Adding 2 integers through a list
		Vector<Number> l = new Vector<Number>();
		l.add(new Integer(34));
		l.add(new Integer(43));
		System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));
		
// Subracting 2 integer
		System.out.println("Subraction with generic method: "+sub(5, 3));
		
// Subracting 2 integer throw a list
		
		System.out.println("subraction with upper bounded wildcard: "+sub(l));
		
//Division of 2 no
		
		System.out.println("Division with generic method: "+div(10,0));

//Division of 2 no using a list
		Vector<Number> l1=new Vector<Number>();
		l1.add(4);
		l1.add(2);
		System.out.println("Division with upper bounded wildcard: "+div(l1));
		
// Dumping the list to the console.
		ArithmeticOperations.dumpList(l);
	}
}
