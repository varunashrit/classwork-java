package collectionsExample.set;

import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

import collectionsExample.EQUALS.Employee;

public class SetExample {
	public static void main(String[] args) {
		//Set will not store duplicate items
		Set set = new HashSet();
		set.add("Varun");
		set.add(null);
		set.add("Varun");
		set.add(15);
		set.add(18.78);
		
		System.out.println(set);
		System.out.println("---------using string set -------------");
		Set<String> setOfstr = new HashSet<String>();
		setOfstr.add("Varun");
		setOfstr.add(null);
		setOfstr.add("Varun");
		setOfstr.add("15");
		setOfstr.add("18.78");
		System.out.println(setOfstr);
		System.out.println("-------Employee-------");
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e.setEmpId(11);
		e1.setEmpId(12);
		e2.setEmpId(13);
		e3.setEmpId(14);
		
		
		Set<Employee> setOfEmployee =new HashSet();
		setOfEmployee.add(e);
		setOfEmployee.add(e1);
		setOfEmployee.add(e2);
		setOfEmployee.add(e3);

		System.out.println(setOfEmployee);
		System.out.println(setOfEmployee.size());
		
		int cap = (int) ((16/0.75f)+1);
		System.out.println(cap);
		System.out.println("---------TREESET---------");
		//TreeSet it does not allow duplicates
//		BY default it is in ascending order by default
//		NON synchronised
//		if more than one threads access it then it needs to be synchronised
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("ondu");
		ts.add("eradu");
		ts.add("mooru");
		ts.add("nalku");
		System.out.println(ts);
		TreeSet ts1 = new TreeSet();
		ts1.add(1);
		ts1.add(2);
		ts1.add(4);
		ts1.add(3);
		ts1.add(5);
		ts1.add(5);
//		ts1.add(null);
		System.out.println(ts1);
		TreeSet<Integer> descTree = (TreeSet<Integer>) ts1.descendingSet();
		System.out.println(descTree);

		TreeSet<Student> setOfStud =new TreeSet<Student>();
		
		Student stud = new Student();
		Student stud1 = new Student();
		Student stud2= new Student();
		Student stud3 = new Student();
		
		stud.setStudentId(1111);
		stud1.setStudentId(1112);
		stud2.setStudentId(1113);
		stud3.setStudentId(1114);
		
		setOfStud.add(stud);
		setOfStud.add(stud1);
		setOfStud.add(stud2);
		setOfStud.add(stud3);
		
		
		System.out.println(setOfStud);
		
		
	}

}
