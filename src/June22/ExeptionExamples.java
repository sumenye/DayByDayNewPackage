package June22;

import June5.Circle;
import June9.Shape;
import June9.Square;

public class ExeptionExamples {

	public static void main(String[] args) {
		//abc efg 
	    
	    // ArrayIndexOutOfBoundException 
	       int[] nums = {1,5,6} ; 
	       //System.out.println( nums[99] );

	    // NullPointerException
	       String str = null ; 
	       //System.out.println( str.length());
	       
	      // ArithmaticException
	    //System.out.println( 10/0  );
	       
	       // ClassCastException 
	    Object o = new Object(); 
	    String oStr =  (String) o ;  //String oStr = new Object(); BAD !!
	    Shape s = new Square("RED",5) ; 
	    //Circle c =  (Circle) s ;  // Circle c  = new Square("RED",5); BAD !!!
	    
	  }

	}