package April10;

import java.util.Arrays;

public class SplitTask {

	public static void main(String[] args) {
	
String groceries = "milk, egg, tomatoes, apples, cookies, chips" ;
String []newgrocery = groceries.split(", ");
System.out.println(Arrays.toString(newgrocery));
int sizeOfArray = newgrocery.length;
System.out.println("number of the items in the array: "+sizeOfArray);
int sizeOfwords =0;
for(int i=0; i<sizeOfArray;i++) {
System.out.println("number"+i+" item has the length of "+newgrocery[i].length());

}
		
	}

}
