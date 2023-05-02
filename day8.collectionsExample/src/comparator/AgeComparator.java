package comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() == o2.getAge()) {
			return 0;
		}else if(o1.getAge()>o2.getAge()) {
			return 1;
		}else {
			return -1;
		}

	}
}