package May4;

import java.util.ArrayList;

public class TaskLeftOver {

	public static void main(String[] args) {
	    ArrayList<Integer> lst = new ArrayList<>();
	    // adding 1-100 to the list 
	    
	    for (int i = 100; i > 0; i--) {

	      lst.add(i);

	    }
	    System.out.println(lst);
	    
	    int count = 0 ; 
	    for(Integer each: lst) {
	      
	      if(each%3==0 && each%5==0)
	        count++ ; 
	        //System.out.println("target number : " + each);
	      
	    }
	    System.out.println("The target count is : " + count);
	    
	    
	    
	  }

}
