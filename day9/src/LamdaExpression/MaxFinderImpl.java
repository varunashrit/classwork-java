package LamdaExpression;

public class MaxFinderImpl implements MaxFinder {

	@Override
	public int maximum(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}
		return num2;
	}

}

