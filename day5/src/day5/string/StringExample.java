package day5.string;

public class StringExample {
	public static void main(String []args) {
		char [] c = {'H', 'i', 'R','a','m'};
		String str = new String(c);
		String s = "helloo";
		if ("hello" instanceof String) {
			System.out.println(true);
		}
		System.out.println(s);
		s= "Hi";
		System.out.println(s);
	}
	
}
