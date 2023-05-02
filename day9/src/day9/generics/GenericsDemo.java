package day9.generics;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsDemo {
public static void main(String[] args) {
	Sender<String> stringSender = new Sender<String>();
	
	Sender<Employee> empSender = new Sender<Employee>();
	stringSender.setMessage("YOYO");
	stringSender.sendMessage();
	
	List<String> listOfString = new ArrayList<String>();
	listOfString.add("YOYOYOYOYO");
	
	Employee emp  = new Employee();
	emp.setEmpId(11);
	emp.setfName("Varun");
	emp.setlName("Ashrit");
	
	
	HashMap<String, Mammal> map = new HashMap<String, Mammal>();
	map.put("wombat", new Mammal("wombat"));
	Mammal mammal = map.get("wombat");
	System.out.println();
}
}
