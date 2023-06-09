package Airplane;



import java.util.Scanner;

public class AssignSeatMain
{
	
	public static int getIntRange( int low, int high ) {
		Scanner in = new Scanner( System.in );
		int input = 0;
		boolean valid = false;
		while( !valid ) {
			if( in.hasNextInt() ) {
				input = in.nextInt();
				if( input <= high && input >= low ) {
					valid = true;
				} else {
					System.out.println( "Invalid Range." );
				}
			} else {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
	}
	
	private static void getAvailability(Airplane myAirplane) {
		if (!myAirplane.isMatched()) {
			System.out.println("There's no availability, please try again");
		}
	}
	
	private static void menu(Airplane myAirplane) {
		boolean done = true;
		while (done) {
			String header = "A)Add\tS)Show\tQ)Quit";
			System.out.println(header);
			
			@SuppressWarnings("resource")
			Scanner in = new Scanner (System.in);
			String input = in.nextLine();
			while (true) {
				if (input.equalsIgnoreCase("a")
					|| input.equalsIgnoreCase("s")
					|| input.equalsIgnoreCase("q"))
					break;
				else {
					System.out.println("Invalid Input.");
					input = in.next();
				}
			}
			// input is "s", show airplane seating map
			if (input.equalsIgnoreCase("s"))
				System.out.println(myAirplane);
			// input is "a", prompt next input to choose First Class or Economy Class
			else if (input.equalsIgnoreCase("a")) {
				System.out.println("F)First\tE)Economy");
				input = in.next();
				while (true) {
					if (input.equalsIgnoreCase("f") || input.equalsIgnoreCase("e"))
						break;
					else {
						System.out.println("Invalid Input.");
						input = in.next();
					}
				}
				// input is "f", prompt next input to be number of passenger, 1 or 2 only
				if (input.equalsIgnoreCase("f")) {
					TravelClass tc = TravelClass.FIRST_CLASS;
					System.out.println("Passengers? (1-2)");
					int number = getIntRange(1,2);
					// input is "2", assign 2 seats in First Class
					if (number == 2) {
						myAirplane.addSeat(2, tc, null);
						getAvailability(myAirplane);
					}
					// input is "1", prompt next input to choose aisle or window seat
					else {
						System.out.println("A)Aisle\tW)Window");
						input = in.next();
						while (true) {
							if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("w"))
								break;
							else {
								System.out.println("Invalid Input.");
								input = in.next();
							}
						}
						// input is "a", add 1 AISLE seat in First Class
						if (input.equalsIgnoreCase("a")) {
							myAirplane.addSeat(1,tc, SeatType.AISLE);
							getAvailability(myAirplane);
						} 
						// input is "w", add 1 WINDOW seat in First Class
						else {
							myAirplane.addSeat(1,tc, SeatType.WINDOW);
							getAvailability(myAirplane);
						}
					}
				}
				// input is "e", prompt next input to be number of passenger, 1 or 2 or 3 only
				else if (input.equalsIgnoreCase("e")) {
					TravelClass tc = TravelClass.ECONOMY_CLASS;
					System.out.println("Passengers? (1-3)");
					int number = getIntRange(1,3); // number variable hold number of passenger input
					// input is "3", assign 3 seats in Economy Class
					if (number == 3) {
						myAirplane.addSeat(3, tc, null);
						getAvailability(myAirplane);
					}
					// input is "1" or "2", prompt next input to choose aisle or center or window seat
					else {
						System.out.println("A)Aisle\tC)Center\tW)Window");
						input = in.next();
						while (true) {
							if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("c") || input.equalsIgnoreCase("w"))
								break;
							else {
								System.out.println("Invalid Input.");
								input = in.next();
							}
						}
						// input is "a", assign "number" AISLE seats in Economy Class
						if (input.equalsIgnoreCase("a")) {
							myAirplane.addSeat(number,tc, SeatType.AISLE);
							getAvailability(myAirplane);
						}
						// input is "c", assign "number" CENTER seats in Economy Class
						else if (input.equalsIgnoreCase("c")) {
							myAirplane.addSeat(number, tc, SeatType.CENTER);
							getAvailability(myAirplane);
						}
						// input is "w", assign "number" WINDOW seats in Economy Class
						else {
							myAirplane.addSeat(number, tc, SeatType.WINDOW);
							getAvailability(myAirplane);
						}
					}
				}
			}
			// input is "q", quit menu
			else if (input.equalsIgnoreCase("q")) {
				System.out.println("Reservation closed\n--------------------------");
				done = false;
			}
		}
	}
	
	
	public static void main(String[] args) {	
		Airplane myAirplane = new Airplane();
		menu(myAirplane);
		
		Airplane testAirplane = new Airplane();

		//populate First Class to test warning message
		testAirplane.addSeat(1, TravelClass.FIRST_CLASS, SeatType.AISLE);
		testAirplane.addSeat(2, TravelClass.FIRST_CLASS, null);
		testAirplane.addSeat(2, TravelClass.FIRST_CLASS, null);
		testAirplane.addSeat(1, TravelClass.FIRST_CLASS, SeatType.AISLE);
		testAirplane.addSeat(1, TravelClass.FIRST_CLASS, SeatType.AISLE);
		testAirplane.addSeat(2, TravelClass.FIRST_CLASS, null);
		testAirplane.addSeat(2, TravelClass.FIRST_CLASS, null);
		testAirplane.addSeat(1, TravelClass.FIRST_CLASS, SeatType.AISLE);
		testAirplane.addSeat(1, TravelClass.FIRST_CLASS, SeatType.AISLE);
		testAirplane.addSeat(2, TravelClass.FIRST_CLASS, null);
		//populate Economy Class to test warning message
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.WINDOW);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.WINDOW);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(1, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(2, TravelClass.ECONOMY_CLASS, SeatType.CENTER);
		testAirplane.addSeat(3, TravelClass.ECONOMY_CLASS, null);

//		System.out.println("---Tester---");
//		System.out.println(testAirplane);
//		menu(testAirplane);
		
	}
}
