package day10Tourist.DAO;

import java.util.List;

import day10Tourist.data.Tourist;



public interface TouristDAO {
//	// i. Display tourist
	public List<Tourist> getTourists();
//
//	public void addTourist
//	// iii. Display name wise sorted
//	// TODO
//	// iv. Display city wise sorted.
//	// TODO
//	// v. Display tourist details for a given id handle tourist not found exception
//	public Tourist getTouristById(Integer touristId);
//
//	// vi. Add Tourist Data
	public void addTourist(Tourist tourist);
}


