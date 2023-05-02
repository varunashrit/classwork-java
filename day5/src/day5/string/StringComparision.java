package day5.string;

public class StringComparision {

	public static void main(String[] args) {
//		on the basis of content and reference
//		By using equals()
//		By using == operator
//		By using compareTo()
		// TODO Auto-generated method stub
		String str = "Hello";
		String s ="Hello";
		String s1 = new String("Hello");
		System.out.println(str== s1); // compares references
		System.out.println(str.equals(s)); // compares values
		
		System.out.println(str==s1);//false references are diff
		System.out.println(str.equals(s1));
		
		
		

	}

}
