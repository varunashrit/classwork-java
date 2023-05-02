package day5.string;

public class EmployeeMain {
	public static void main(String []args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEmpId(1);
		e2.setEmpId(2);
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1);
	}
	

}
