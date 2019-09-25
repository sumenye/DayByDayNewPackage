package May4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListCreationInOneShot {

	public static void main(String[] args) {
		
		//Arrays.asList(var arg) can be used to
		//ad items while object is being created
		
		//However ,
		//1--the variable type must be A LIST
		//because the method return List not ArrayList
		//2-- it will generate an unmodifiable list
		//can not add or remove item
		List<Integer> lst = Arrays.asList(3,5,6,7,5,4,3);
		//lst.add(100);
		lst.set(0, 100);
		System.out.println(lst);
		
//		List<String> JLA = Arrays.asList("Superman", "Batman","Woner Woman");
//		System.out.println(JLA);
		
	    ArrayList<String> JLA=
	    	     new ArrayList<>( Arrays.asList("Superman","Batman","Wonder Woman") ); 
	    	        
	    	    JLA.add("Flash"); 
	    	    JLA.add("Thanos") ; 
	    	    JLA.remove("Thanos") ; 
	    	    System.out.println(JLA);
		
	}

}
