package collectionsExample.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collectionsExample.EQUALS.Employee;

public class ArrayListExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(7);
		/*
		 * ArrayList is a class list reference variable is refereing to an instance of
		 * ArrayList Class In the below example we are calling add method of arraylist
		 * using different types of data.
		 */
		List list = new ArrayList();
		list.add("Hello");
		list.add(15);
		list.add(15.77);
		list.add(222);
		System.out.println(list);
		System.out.println("--------------------------");
		list.add(list);
		list.add(emp);
		System.out.println(list);
		System.out.println("----------------------------");
		list.add(1, "Varun");
		list.add(2, "Karthik");
		list.add(3, 3);
		list.add(null);
		list.add(4, null);
		System.out.println(list);
		System.out.println("-------------------------------");
/* Getting the element using get method by passing the index
 * using get method it takes int as a parameter 
 * */		
		System.out.println("---------Array list using.get(index)-----------------");
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println("---------Arrays list using for loop----------------------");
		int size= list.size();
		System.out.println("Size of the list is--"+size);
		for (int index =0; index<size; index++) {
			System.out.println(list.get(index));
		}
//		System.out.println("*******for -each*******");
//		for (Object ob: list) {
//			System.out.println(ob+"--instance of --"+ob.getClass());
//		}
		System.out.println("-------------------------------");
		List<Integer> listofObjects = new ArrayList<Integer>(); //this was introduced in java 1.5 called as generics.
		listofObjects.add(15);
		listofObjects.add(null);
//		listofObjects.add("Hello");
//		listofObjects.add(23.43);
		listofObjects.add(11);
		listofObjects.add(9);
		for(Integer e : listofObjects) {
			System.out.println(e);
		}
		System.out.println("-------------------------------");
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		Employee emp3= new Employee();
		emp1.setEmpId(2);
		emp2.setEmpId(3);
		emp3.setEmpId(4);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println("---------------------------------");
		for(Employee em : empList) {
			System.out.println(em);
		}
		System.out.println("-----------Removing from list------------------");
		list.remove("Varun");
		list.remove(4);
		System.out.println(list);
		
		List<Integer> listofInt = new ArrayList<Integer>();
		listofInt.add(0);
		listofInt.add(11);
		listofInt.add(22);
		listofInt.add(33);
		listofInt.add(44);
		listofInt.add(44);
		listofInt.add(44);
		
		System.out.println("------------removing from list if ingtegers using"
				+ "Integer.valueOf(44)------------------");
		System.out.println(listofInt);
		listofInt.remove(Integer.valueOf(44));
//		to remove all the occurences of 44
//		for (int i =0;i<(listofInt.size()) ;i++) {
//			listofInt.remove(Integer.valueOf(44));
//		}
		System.out.println(listofInt);
		Iterator itr = listofInt.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
