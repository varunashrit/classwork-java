package day10Tourist.service;

import java.util.List;

import day10Tourist.Exceptions.IdErrorException;
import day10Tourist.data.Tourist;

public interface TouristService {

	// i. Display tourist
	public List<Tourist> getTourists();

	// ii. Display all the tourist belong to a particular city
	// TODO
	public List<Tourist> getCityTourists(String city);
	
	// iii. Display name wise sorted
	// TODO
	public List<Tourist> sortedNameList();
	
	// iv. Display city wise sorted.
	// TODO
	public List<Tourist> sortedCityList();
	
	// v. Display tourist details for a given id handle tourist not found exception
	public void getTouristById(Integer touristId) throws IdErrorException;
	
	public void addTourist(Tourist tourist);
}
