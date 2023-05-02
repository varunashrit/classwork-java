package day8ExercisesSubtractDivide;

public class Swapping {

	public static <T> T[] swap(T [] list, int firstPos, int secondPos) throws IndexOutOfBoundsException {
		if(firstPos<0||secondPos<0||firstPos>=list.length||secondPos>list.length)
		{
			throw new IndexOutOfBoundsException();
		}
		
		T t;
		t=list[firstPos];
		list[firstPos]=list[secondPos];
		list[secondPos]=t;
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,3,4,5};
		String str[]= {"b","ba","abc","abcd","abcde"};
		for(Integer i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(Object i:str) {
			System.out.print(i+" ");
		}
		System.out.println();
		try {
			swap(a,1,3);
			swap(str, 1, 3);
		}catch(IndexOutOfBoundsException e){
			System.out.println("posistions  out of bound");
		}finally {
			
			for(Object i:str) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(Integer i:a) {
				System.out.print(i+" ");
			}
		}
	}

}
