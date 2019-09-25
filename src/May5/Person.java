package May5;
import java.util.Random;
public class Person {

	
	
		//properties of the object are define by instance variable/field
		String name;
		int age;
		char gender;
		
		//----------MAIN METHOD IS A PLACE TO RUN YOUR CODE----------------
		
		/**
		 * 
		 * Horse:
		 * properties: color, age, breed
		 * 
		 * behaviors: jump, eat, run, kick, 
		 * 
		 * Person:
		 * properties: name, age, gender
		 * 
		 * behavior: eat,study,laugh,sleep
		 * 
		 * */
		String str = new String("abc");
	
//create a custom class caled horse
		//it should have 4 instance variables
		
		//any object created out of this class
		//should have 4 attribute as below
		//breed as string
		//age as int
		//coloras string
		//height as double
		
		
		//public static void eat() {
		  // any non-static method is called instance method 
		  public void eat() {
		    
		    System.out.println(" eating ");
		    
		  }
		  
		  public void tellMeYourName() {
		    System.out.println("My Name is " + name);
		  }
		  
	

}
