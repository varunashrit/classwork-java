package collectionsExample.mAp;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> hm = new TreeMap<String, Double>();
		hm.put("VArun", 15.55);
		hm.put("ARun", 16.55);
		hm.put("Nikhil", 17.55);
		hm.put("Karthik", 18.55);
//		hm.put(null, null);
//		hm.put(null, 18.09);
		hm.put("IND", 18.00);

		System.out.println(hm);
		Set set = hm.entrySet();
		System.out.println(set);
		System.out.println(hm.keySet());
		System.out.println(hm.get("IND"));

		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
		System.out.println("*************************************");
		for(Map.Entry<String,Double> m : hm.entrySet()) {
			System.out.println(m.getKey() + " == "+m.getValue());
		}
		
		System.out.println("*************************************");
		
	}

}
