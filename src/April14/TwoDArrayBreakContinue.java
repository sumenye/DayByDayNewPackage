package April14;

public class TwoDArrayBreakContinue {

	public static void main(String[] args) {
		 int[][] data = { {2,14,3} , {4,5} , {9}  } ; 
		 
		for (int i = 0; i < data.length; i++) {
		      
		      // this will skip second iteration -- which is 2nd row 
//	      if(i==1) {
//		        continue ; 
//		      }
//		      if(i==1) {
//	        break ; 
//	      }
		     
		      System.out.print("Row Number " + (i+1) + " : ");
		      
		      for(int j=0 ; j <  data[i].length ; j++) {
		        
		        if(data[i][j]==4)
		          continue; 
		        
		        System.out.print( data[i][j] + " "    );
		      }
		      
		      System.out.println();
		      
		      
		    }
	}

}
