package exceptionNullPointer;

import java.util.Scanner;

public class CountLetters {
	public static void main(String[]args) {
		int a;
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a single word (letters only): ");
		String word = scan.nextLine();
		
		word =word.toUpperCase();
		try {
			for (int i = 0;i< word.length();i++) {
				counts[word.charAt(i)-'A']++;
				
				System.out.println();
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Not a letter: "+ e.getMessage());
			
		}
		
			for(int i1=0; i1<counts.length; i1++)
				if(counts [i1]!= 0)
					System.out.println((char)(i1+'A')+": "+ counts[i1]);
		
	}

}
