package April14;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDData {

	public static void main(String[] args) {
		
		int [][] data = new int[4][2];
		
		data[0][0] = 12;
		data[0][1] = 17;
		data[1][0] = 3;
		data[1][1] = 40;
		data[2][0] = 44;
		data[2][1] = 27;
		data[3][0] = 23;
		data[3][1] = 12;
		
//	    int FinalData [] [] = data;
//	    int sum=0;
//	    
//	    //use for each to print and get sum
//	    
//	    for(int rows [] : FinalData) {
//	    	
//	    	for(int allRowsAndColumns : rows) {
//	    		sum+=allRowsAndColumns;
//	    	}
//	    	
//	    	System.out.println("Sum is: "+ sum);
//	    }
//	    
//	    
//	    
//	    for(int i=0; i<FinalData.length; i++) {
//	    	System.out.println(Arrays.toString(FinalData[i]));
//	    }
	    for(int[] row : data ) {
	    	  
	    	  for( int cell : row) {
	    	    
	    	    System.out.print( cell + " ");
	    	    
	    	  }
	    	  System.out.println();
	    	  
	    	}
	}

}