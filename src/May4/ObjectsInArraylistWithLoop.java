package May4;

import java.util.ArrayList;

public class ObjectsInArraylistWithLoop {

	public static void main(String[] args) {
		  ArrayList<String> myList = new ArrayList<>();
		    
		    myList.add("Zuccini");
		        myList.add("cucumber");
		        myList.add("cabbage");
		        myList.add("watermelon");
		        myList.add("BlueBerry");
		        myList.add("Apple");
		        myList.add("Bananas");
		        myList.add("Milk");

		        for(int i=0; i<myList.size(); i++) {
		        	
		        	System.out.print(myList.get(i)+" - ");
		        }
		        
		        System.out.println();
		        
		        for( String each :  myList ) {
		          System.out.print( " | Item : " + each);
		        }
	}

}
