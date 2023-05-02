package day10Tourist.service;

import java.util.Comparator;
import java.util.List;

import day10Tourist.DAO.TouristDAO;
import day10Tourist.DAO.TouristDAOImpl;
import day10Tourist.Exceptions.IdErrorException;
import day10Tourist.data.Tourist;
//Business Layer or Service Layer or Middle Layer
public class TouristServiceImpl implements TouristService  {

	@Override
	public List<Tourist> getTourists() {
		
		TouristDAO touristDao = new TouristDAOImpl();
		return touristDao.getTourists();// Calling DAO layer methods from service layer
	}

	@Override
	public void getTouristById(Integer touristId) throws IdErrorException {
		
		TouristDAO touristDao = new TouristDAOImpl();

		List<Tourist> tourists = touristDao.getTourists().stream()
				.filter(id -> id.getTouristId() == touristId)
				.toList();
		
		if (tourists.isEmpty()) {
			throw new IdErrorException("ID is not correct");
		} else {
			tourists.stream().forEach(System.out::println);
		}
	}

	@Override
	public List<Tourist> getCityTourists(String cityName) {
		
		TouristDAO touristDao = new TouristDAOImpl();
		
		List<Tourist> filteredTourists = touristDao.getTourists().stream()
				.filter(city -> city.getCity().equals(cityName))
				.toList();
				
		return filteredTourists;
	}

	@Override
	public List<Tourist> sortedNameList() {
		
		TouristDAO touristDao = new TouristDAOImpl();
		
		List<Tourist> filteredTourists = touristDao.getTourists().stream()
				.sorted(Comparator.comparing(Tourist::getTouristName))
				.toList();
				
		return filteredTourists;
	}

	@Override
	public List<Tourist> sortedCityList() {
		
		TouristDAO touristDao = new TouristDAOImpl();
		
		List<Tourist> filteredTourists = touristDao.getTourists().stream()
				.sorted(Comparator.comparing(Tourist::getCity))
				.toList();
				
		return filteredTourists;
	}

	@Override
	public void addTourist(Tourist tourist) {
		
		TouristDAO touristDAO = new TouristDAOImpl();
		touristDAO.addTourist(tourist);
	}

}


