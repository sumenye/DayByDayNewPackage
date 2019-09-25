package April14;

public class TwoDArraysExamp {

	public static void main(String[] args) {
		int[][] nums = { { 2, 14, 3 }, { 4, 5 }, { 9, 7 } };

		for (int i = 0; i < nums.length; i++) {
		  for (int j = 0; j < nums[i].length; j++) {
		    System.out.print(nums[i][j] + " ");
		  }
		  System.out.println();

		}
		  int [][] table= {{12, 17,5},{3, 40},{44, 27},{10,23,12}};
		  
		  System.out.println("\nFor iteration: ");    
		  for (int row = 0; row < table.length; row++) {

		    for (int col = 0; col < table[row].length; col++) {
		      System.out.print(table[row][col] +" ");
		    }
		    System.out.println();
		  }	
		  //------------------AKBARS LOOP--------

		    // System.out.println( "data["+0+"]["+0+"] = " + data[0][0] );

		    for (int i = 0; i < nums.length; i++) {

		      for (int j = 0; j < nums[i].length; j++) {
		        System.out.print("data[" + i + "][" + j + "] = " + nums[i][j] + " | ");
		      }
		      System.out.println();
		    }
		
	}

}
