package LamdaExpression.Calculator;

public class Calculator {
	public static void main(String[] args) {
		Add n = (num1, num2)-> num1+num2;
		System.out.println("Addition: "+n.add(20, 10));
		Subtract m = (num1, num2)-> num1-num2;
		System.out.println("Subtraction: "+m.sub(55,36));
	}
}
