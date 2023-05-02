package collectionsExample.mAp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Key, String> cityMap = new HashMap<Key, String>();
		cityMap.put(new Key(1,"GK"), "Gokak");
		cityMap.put(new Key(2,"ND"), "New Delhi");
		cityMap.put(new Key(3,"LKO"), "Lucknow");
		cityMap.put(new Key(3,"HWH"), "Howrah");
		cityMap.put(new Key(5,"BGM"), "Belagavi");
		System.out.println("size before iterations:--"+cityMap.size());
		System.out.println("-------------------------------");
		System.out.println((cityMap.keySet()));
		System.out.println("-------------------------------");
		System.out.println(cityMap.get(new Key(1, "GK")));
		
		Iterator <Key> itr = cityMap.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(cityMap.get(itr.next()));
		}
		System.out.println("==--=-=---=-=--=---=----=-=-=-=-=-=-=-=");
		System.out.println("size after iterations--"+cityMap.size());
	}

}
