package day9.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsExample {
	public static void main(String[] args) {
		//Without generics
		List list = new ArrayList();
		list.add(15);
		Integer intObj = (Integer) list.iterator().next();
		//Using generics
		List<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(11);
		Integer num = listOfNum.iterator().next();
		
		Map map = new HashMap();
		map.put(1, "Hello");
		map.put(2, "Generics");
		String hello =(String) map.get(1);
		String generics = (String) map.get(2);
		
		Map<Integer,String> maps = new HashMap<Integer,String>();
		maps.put(1, "Hello");
		maps.put(2, "Generics");
		String hello1 =maps.get(1);
		String generics2 = maps .get(2);
	}
}

