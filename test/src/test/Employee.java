package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();

	}
}

class EmployeeInfo {
	enum SortMethod {
		BYNAME, BYSALARY
	};

	public List<Employee> sort(List<Employee> emps,final SortMethod method){
        Comparator<Employee> comparator;
        if(method == SortMethod.BYNAME) {
            comparator = Comparator.comparing(Employee::getName);
//             System.out.println(comparator);
            }
            else {
                comparator = Comparator.comparing(Employee::getSalary);
//                System.out.println(comparator);
                }
                return emps.stream().sorted(comparator).collect(Collectors.toList());
                }

	public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
//		int count=0;
		long cnt = entities.stream().filter(x -> x.name.startsWith(character)).count();
		if (cnt == 1)
			return true;
		else
			return false;
	}
}
	