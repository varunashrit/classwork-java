package LamdaExpression;

public class MaxFinderLamdaExample {
	public static void main(String[] args) {
		MaxFinder max = (num1,num2)-> num1>num2?num1:num2;
		int result = max.maximum(101,20);
		System.out.println(result);
		
		
	
	}
	
}
