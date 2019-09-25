package April16;

import java.util.Scanner;

public class MethodWithParameter {

	public static void main(String[] args) {
	
		//Arrays.sort(arr);
		holdYourHorse("Anar");
	//	holdYourHorse(12345); // DOES NOT COMPILE, DATATYPE DOES NOT MATCH
		holdYourHorse("David");
		holdYourHorse("Fatma");
		holdYourHorse("Sumeyye");
		
		Scanner scan = new Scanner(System.in); 
		  System.out.println("HOLD WHOESE HORSE?");
	    String name = scan.next(); 
	  
	    holdYourHorse(name); 

	}

public static void holdYourHorse(String owner) {
  
  // String owner = "Anar" ;
   
   System.out.println(owner + ", hold your horse please!");       
  
}



}
