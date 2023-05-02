package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		EmployeeInfo EI = new EmployeeInfo();
		
//		List<Employee> empsList = new ArrayList<Employee>();
		EI.sort(emps,EmployeeInfo.SortMethod.BYSALARY);
		boolean result = EI.isCharacterPresentInAllNames(emps, "K");
		System.out.println(emps);
		Map<Long, String> mp  = new HashMap<>();
	}
}
