package firstProjectAssignments;

import java.util.Scanner;

public class EvenValues {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array");
		for (int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Even elements are: ");
		areEven(arr,n);
	}

	 static void areEven(int[] arr, int n) {
		// TODO Auto-generated method stub
		 for (int i =0; i<n;i++) {
			 if(arr[i]%2==0) {
				 System.out.println(arr[i]+" ");
			 }
		 }
		
	}

}
