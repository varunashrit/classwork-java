package day10Tourist.DAO;

import java.util.ArrayList;
import java.util.List;

import day10Tourist.data.Tourist;
//Data Layer or DAO Layer or Data Access Object or Persistence Layer
public class TouristDAOImpl implements TouristDAO {

	/**
	 * As of now we have not learned about DB but we know collections You can use
	 * collections to perform below tasks
	 */
	/*
	 * @Override public List<Tourist> getTourists() { // TODO Auto-generated method
	 * stub
	 * 
	 * return null; }
	 * 
	 * @Override public Tourist getTouristById(Integer touristId) { // TODO
	 * Auto-generated method stub return null; }
	 */

	private static List<Tourist> tourists = new ArrayList<>();
	
	@Override
	public void addTourist(Tourist tourist) {
		
		tourists.add(tourist);
		System.out.println(tourist.getTouristName() + " added successfully");
	}

	@Override
	public List<Tourist> getTourists() {
		return tourists;
	}

}
