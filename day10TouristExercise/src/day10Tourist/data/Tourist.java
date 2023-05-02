package day10Tourist.data;

public class Tourist {
	private Integer touristId;
	private String touristName;
	private String city;
	
	
	public Tourist() {
		// TODO Auto-generated constructor stub
	}


	public Tourist(Integer touristId, String touristName, String city) {
		this.touristId = touristId;
		this.touristName = touristName;
		this.city = city;
	}


	public Integer getTouristId() {
		return touristId;
	}


	public void setTouristId(Integer touristId) {
		this.touristId = touristId;
	}


	public String getTouristName() {
		return touristName;
	}


	public void setTouristName(String touristName) {
		this.touristName = touristName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Tourist [touristId=" + touristId + ", touristName=" + touristName + ", city=" + city + "]";
	}
	
	
	
}
