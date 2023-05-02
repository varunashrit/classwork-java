package java8feautures;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class EmployeeMain {
	public static void main(String[] args) {
		Supplier<? extends Employee> s = ()->new Employee("VARUN");
		Employee emp2 = s.get();
		System.out.println("---------------------");
		System.out.println(emp2.getName());
		
		Supplier<? extends Integer> sInt = ()->Integer.valueOf(7);
		System.out.println(sInt.get());
//		IntSupplier<? extends Integer> si = ()-> si.;
	}
	
}
