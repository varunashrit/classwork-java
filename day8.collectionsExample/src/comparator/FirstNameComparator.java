package comparator;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getfName().compareTo(o2.getfName());
	}
}
