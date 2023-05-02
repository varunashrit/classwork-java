package firstProjectMain;

import firstProjectData.Address;
import firstProjectData.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//emplyoee is a variable from the employee.java
		Employee employee = new Employee();
		System.out.println(employee);
		
		Employee employee1= new Employee(1,"Stark");
		System.out.println(employee1);
		
		employee1.setEmpId(15);
		employee1.setEmpName("Tony");
		
		System.out.println(employee1);
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getEmpId());
		System.out.println(employee1);
		
		Address addr= new Address();
		addr.setCity("Bengaluru");
		addr.setCountry("India");
		addr.setHouseNo(6);
		addr.setState("Karnataka");
		addr.setStreet("Brookefield");
		addr.setPinCode((long) 591307);
		
		System.out.println(addr);
		
		Employee emp = new Employee();
		emp.setAddress(addr);
		emp.setEmpId(7);
		emp.setEmpName("mav");
		System.out.println(emp);
	}

}
