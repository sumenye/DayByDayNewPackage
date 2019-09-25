package July13_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WarmUp {

	public static void main(String[] args) {
	    
	    // GIVEN 
	    String str = "ABCABCEFGADBHYKJSGD"; 
	    // Find Out how many unique character 
	  
	    
	    // HINT : 
	    
	    // Convert this to an array 
	    
	    // store it in List 
	    
	    // use one of data structure that store unique element
	    String[] arr = str.split("");
	    
	    List<String> list =new ArrayList<>(Arrays.asList(arr));
//	    for(Character each: str) {
//	    list.add(each);}
	    Set<String> unique1=new HashSet<>(list);
	   // List<String> strlist = new Set<>(list);
	    
	    System.out.println(unique1);
	  }


}
