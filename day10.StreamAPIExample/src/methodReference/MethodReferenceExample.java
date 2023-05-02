package methodReference;

import java.util.function.Consumer;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Consumer<String> consumer = str->System.out.println(str);
		consumer.accept("Prabhat");
		//Below code instead of Lmbda expression we are passing the method reference
		//Method reference is a shorthand for lambda expression
		Consumer<String> con = System.out::println;
		con.accept("Shahrukh Khan");
		

	}

}

