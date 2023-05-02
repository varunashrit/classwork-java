package day8ExercisesSubtractDivide;



public abstract class S implements Comparable<S>{
	private int age;
	
	public int compareTo(S o1, S o2) {
		if(o1.getAge()==o2.getAge()) {
			return 0;
		}else if(o1.getAge() >o2.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public S(int age) {
		super();
		this.age = age;
	}


	public S() {
		super();
	}


	@Override
	public String toString() {
		return "S [age=" + age + "]";
	}


}
