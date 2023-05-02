package firstProjectAssignments;

public class rowColumn {
		   public static void main(String[] args) {
		      final int[][] matrix = {
		         { 1,2,3,4,5,6,7,8,9},
		         { 4,5,6},
		         { 7,8,9}
		      };
		      for (int i = 0; i < matrix.length; i++) 
		      { //row 
		         for (int j = 0; j < matrix[i].length; j++) 
		         { //column
		        	if(matrix[i][j]%2!=0){
		        	System.out.print(matrix[i][j] + " ");
		        	}
		         }
		         System.out.println();
		      }
		   }
		
}