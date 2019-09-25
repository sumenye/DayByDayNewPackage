package April14;

import java.util.Arrays;

public class CopyOfRangeMethod {

	public static void main(String[] args) {
	    String[] words = {"coding", "start", "to", "Day", "Perfect", "Sunday"}; 
	     
	     Arrays.sort(words);
	     System.out.println( Arrays.toString(words) );
	     
	     String[] first2words = Arrays.copyOf(words, 2) ;
	     System.out.println( Arrays.toString(first2words) );
	     
	     String[] tenItem = Arrays.copyOf(words,10) ;
	     System.out.println( Arrays.toString(tenItem) );
	     
	    
	     String[] codingStart = Arrays.copyOfRange(words,3,4+1) ; 
	     System.out.println( Arrays.toString(codingStart) );
	}

}
