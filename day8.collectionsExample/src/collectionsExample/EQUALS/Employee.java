package collectionsExample.EQUALS;

import java.util.Objects;

public class Employee {
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}
	
	public static void main(String []args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.setEmpId(1);
		emp1.setEmpId(1);
		System.out.println(emp.equals(emp1));
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
	}

	

}
