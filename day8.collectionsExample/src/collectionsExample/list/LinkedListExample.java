package collectionsExample.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String []args) {
		//Linked List implements List interface an List interface 
		//implements collection interface
//		Insertion order is maintained and non synchronized
	List<String> linkedlist = new LinkedList<String>();
	linkedlist.add("Varun");
	linkedlist.add("Nikhil");
	linkedlist.add("Karthik");
	linkedlist.add("Arun");
	linkedlist.add("Shrishail");
	Iterator<String> itr = linkedlist.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(linkedlist);
	linkedlist.set(1,"Stark");
	System.out.println(linkedlist);
	Collections.replaceAll(linkedlist, "Shrishail", "Shree");
	System.out.println(linkedlist);
	linkedlist.replaceAll(String::toLowerCase);
	System.out.println(linkedlist);
	linkedlist.forEach(System.out::println);
	
	LinkedList<String> linkedlist1 = new LinkedList<String>();
	linkedlist1.add("Varun");
	linkedlist1.add("Nikhil");
	linkedlist1.add("Karthik");
	linkedlist1.add("Arun");
	linkedlist1.add("Shrishail");
	Iterator<String> itr1 = linkedlist1.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	System.out.println(linkedlist1);
	linkedlist1.addFirst("Peter");
	linkedlist1.addFirst("Pepper");
	System.out.println(linkedlist1);
	linkedlist1.removeLast();
	System.out.println(linkedlist1);
	
	}

}
