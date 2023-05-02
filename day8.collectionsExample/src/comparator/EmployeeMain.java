package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee e6 = new Employee();
		
		e1.setEmpId(1);
		e2.setEmpId(2);
		e3.setEmpId(3);
		e4.setEmpId(4);
		e5.setEmpId(5);
		e6.setEmpId(6);
		e.setEmpId(7);
		
		e1.setAge(10);
		e2.setAge(20);
		e3.setAge(30);
		e4.setAge(40);
		e5.setAge(50);
		e6.setAge(60);
		e.setAge(70);

		e1.setSalary(1000.50);
		e2.setSalary(2000.35);
		e3.setSalary(3000.15);
		e4.setSalary(4000.25);
		e5.setSalary(5000.45);
		e6.setSalary(4000.25);
		e.setSalary(7000.10);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e6);
		empList.add(e4);
		empList.add(e5);
		empList.add(e3);
		empList.add(e2);
		empList.add(e1);
		empList.add(e);
		System.out.println(empList);
		System.out.println("----------Sort By EmpID--------------");
		Collections.sort(empList,new EmpIdComparator());
		System.out.println("----------Sort By EmpID--------------");System.out.println(empList);


		List<Employee> empList1= new ArrayList<Employee>();
		empList1.add(e6);
		empList1.add(e4);
		empList1.add(e5);
		empList1.add(e3);
		empList1.add(e2);
		empList1.add(e1);
		empList1.add(e);
		System.out.println(empList1);
		System.out.println("----------Sort By Age--------------");
		Collections.sort(empList1,new AgeComparator());
		System.out.println(empList1);
		
		System.out.println("----------Sort By getSalary--------------");
		System.out.println("----------Passing method reference to get "
				+ "comparator to compare objects--------------");
		Collections.sort(empList1,Comparator.comparing(Employee::getSalary));
		System.out.println(empList1);
		
/*.then comparing is used to comparing multiple attributes and this is called as chaining
 * */
		System.out.println("----------Sort By getAge--------------");
		Collections.sort(empList1,Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge));
		System.out.println(empList1);
		
		
		
	}

}
