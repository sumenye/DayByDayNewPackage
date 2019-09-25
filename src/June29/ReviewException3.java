package June29;

public class ReviewException3 {
	public static void main(String[] args) {
	    
	    
	    // We want to take same action for 
	    // ArithmeticException, ArrayIndexOutOfBoundsException
	    // and everything else we want to take other general action 
	    
	    
	    
	    
	    try {
	      
	      //System.out.println( 6/0 ); // -->>ArithmeticException object is created 
	      throw new ArithmeticException("6 divided by 0"); 
	      
	      //int[] arr = {1,2} ; 
	      
	      //System.out.println( arr[100] );
	      
	      
	    } catch (ArithmeticException e1) {
	      
	      System.out.println("Target Exception happen");
	      
	    } catch (ArrayIndexOutOfBoundsException e2) {
	    
	      System.out.println("Target Exception happen");
	    
	    
	    System.out.println("END ");
	    
	    
	    
	  }

	}
}

