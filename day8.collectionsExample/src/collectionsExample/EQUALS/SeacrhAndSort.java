
package collectionsExample.EQUALS;

import java.util.Arrays;

public class SeacrhAndSort {
	public static void main(String[]args) {
		int arr[] = {10,4,5,6,7,8};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 88));
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	
	}

}
