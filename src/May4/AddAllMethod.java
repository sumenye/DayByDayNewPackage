package May4;

import java.util.ArrayList;

public class AddAllMethod {

	public static void main(String[] args) {
	    ArrayList<Integer> lst1 = new ArrayList<>();
	    for(int i=1; i<=5; i++) {
	      lst1.add(i);
	    }
	    System.out.println(  lst1  );    
	    
	    ArrayList<Integer> lst2 = new ArrayList<>();
	    for (int i = 6; i > 0; i--) {
	      lst2.add(i);
	    }
	    System.out.println(lst2);
	  
	    //// addAll method of ArrayList class 
	    // this will just add every item in lst2 by the end of lst1 items 
//	    lst1.addAll(lst2) ;  
//	    System.out.println( lst1 );
	//    
	    
	    //// addAll method of ArrayList class , second overloaded version
	    // this will just insert every item in lst2
	    // to the specified index 
	    
	    lst1.addAll(1,lst2) ; 
	    System.out.println( lst1 );
	    
	    
	    
	    
	  }

}
