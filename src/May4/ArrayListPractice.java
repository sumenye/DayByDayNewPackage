package May4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
	
	    //List<String> lst2 = new ArrayList<>() ; 
	    
	    ArrayList<String> myList = new ArrayList<>();
	    
	    myList.add("Zuccini");
	        myList.add("cucumber");
	        myList.add("cabbage");
	        myList.add("watermelon");
	        myList.add("BlueBerry");
	        myList.add("Apple");
	        myList.add("Bananas");
	        myList.add("Milk");
	        System.out.println(myList);
	        
	        // update an Item 
	        myList.set(0, "Tomato");
	        System.out.println(myList);
	        
	        //count
	        System.out.println("how many items: "+myList.size());
	        
	        //getting one of the item
	        System.out.println("my third item is: "+myList.get(2));
	        
	        // insert an Item 
	        myList.add(1, "Rasberry");
	        System.out.println(myList);
	        
	        // check an item exists in the list 
	        boolean haveMilkOrNot = myList.contains("Milk") ; 
	        System.out.println("Got Milk ?  " + haveMilkOrNot);
	        
	        System.out.println("Got Milk lowercase?  " +  myList.contains("milk") );
	        
	        //to check the location of certain items
	        int indexOfCabage = myList.indexOf("cabbage");
	        System.out.println("index number of cabbage: "+indexOfCabage);
	    
	        //remove item
	    
	        myList.remove(4); //watermelon will be removed
	        System.out.println(myList);
	        myList.remove("BlueBerry");
	        System.out.println(myList);
	        //when using remove(object) version of the method
	        // if we dont have the item it remain the same
	        myList.remove("kiwi");
	        System.out.println(myList);
	        //index has to be within range or it will throw Exception
	       // myList.remove(100);
	        System.out.println(myList);
	        
	        //deleting all from the list
	        myList.clear();
	        System.out.println(myList);
	        
	        //checking the list ir empty or not
	        System.out.println("is the list empty or not: "+myList.isEmpty());
	        
	        
	      
	  }

}
