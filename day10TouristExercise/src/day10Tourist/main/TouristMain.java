package day10Tourist.main;

import java.util.ArrayList;
import java.util.List;

import day10Tourist.Exceptions.IdErrorException;
import day10Tourist.data.Tourist;
import day10Tourist.service.TouristService;
import day10Tourist.service.TouristServiceImpl;

/**
 * 
 * @author UD SYSTEMS
 *Main class which will be a user interface 
 */
public class TouristMain {

	public static void main(String[] args) {
		TouristService touristService = new TouristServiceImpl();
		System.out.println(touristService.getTourists());
		Tourist t1 = new Tourist();
		Tourist t2 = new Tourist();
		Tourist t3 = new Tourist();
		Tourist t4 = new Tourist();
		Tourist t5 = new Tourist();
		Tourist t6 = new Tourist();
		Tourist t7 = new Tourist();
		
		t1.setTouristId(1);
		t2.setTouristId(2);
		t3.setTouristId(3);
		t4.setTouristId(4);
		t5.setTouristId(5);
		t6.setTouristId(6);
		t7.setTouristId(7);
		
		t1.setTouristName("Bob");
		t2.setTouristName("Alex");
		t3.setTouristName("Tony");
		t4.setTouristName("Peter");
		t5.setTouristName("Dr.Strange");
		t6.setTouristName("Wolverine");
		t7.setTouristName("Wanda");
		
		t1.setCity("Switzerland");
		t2.setCity("Paris");
		t3.setCity("Paris");
		t4.setCity("Greenland");
		t5.setCity("USA");
		t6.setCity("Alaska");
		t7.setCity("Iceland");
		
		touristService.addTourist(t1);
		touristService.addTourist(t2);
		touristService.addTourist(t3);
		touristService.addTourist(t4);
		touristService.addTourist(t5);
		touristService.addTourist(t6);
		touristService.addTourist(t7);
		
		List<Tourist> touristList = new ArrayList<Tourist>();
		touristList.add(t1);
		touristList.add(t2);
		touristList.add(t3);
		touristList.add(t4);
		touristList.add(t5);
		touristList.add(t6);
		touristList.add(t7);
		
		System.out.println(touristList.stream()
				.filter(x->x.getCity().equals("Paris"))
				.toList());
//		List<Integer> tourID = 
//		Counting the number of tourists
		System.out.println(touristList.stream()
				.map(num->num.getTouristId())
				.count());
//		
		System.out.println(touristList.stream()
				.map(x->x.getTouristId()).toList());
		System.out.println("------====-----All Tourists-==-=-=-=-=-=-=");
		System.out.println(touristService.getTourists());

		System.out.println("-=-==-=-=-=-Tourist sorted PARIS-=-=-=-=-=--=-=-");
		System.out.println(touristService.getCityTourists("Paris"));

		System.out.println("-=-=-=-=-=-=-Sorted Tourist Names-=-=-=-=-=-=-=-");
		List<Tourist> sortedNames = touristService.sortedNameList();
		sortedNames.stream().forEach(System.out::println);
		
		System.out.println("-==-=-=-=-=Sorted Tourist Cities-=-=-=-=-=-");
		List<Tourist> sortedCities = touristService.sortedCityList();
		sortedCities.stream().forEach(System.out::println);
		
		System.out.println("-=-==-=-=-Tourist with ID of 4-===-=-=-=-=");
		
		try {
			touristService.getTouristById(4);
			touristService.getTouristById(88);
		} catch (IdErrorException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();

		
	}

}
