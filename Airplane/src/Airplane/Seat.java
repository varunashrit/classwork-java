package Airplane;

//import day6Assignment.coreJavaExercises.SeatType;

public class Seat
{
	private String seat;
	private SeatType seatType;
	private boolean available;
	
	public Seat(SeatType iseatType)
	{
		this.seat = ".";
		this.seatType = iseatType;
		this.available = true;
	}
	
	public SeatType getSeatType()
	{
		return this.seatType;
	}
	
	public void setReserved()
	{
		this.seat = "*";
		this.available = false;
	}
	
	public Boolean isAvailable() {
		return this.available;
	}
	
	public String toString()
	{
		return this.seat;
	}
}