package April30;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

	public static void main(String[] args) {
		int i =10; //container i has 10 inside
		Scanner scan = new Scanner(System.in); //scan object has the address to sacnner
		Double d = new Double("2.14"); //d object tahat has the address of 2.14
		
		
		
		
		//an Arraylist variable lst1 is created
		//an ArrayList object is created and assigned to lst1
		//so we can store any type
		ArrayList lst1 = new ArrayList();//created an object of arraylist
		lst1.add("abc");
		lst1.add("efg");
		lst1.add(new Integer(10));
		lst1.add(Character.valueOf('A'));
		
		System.out.println(lst1);
		//IT IS RECOMMENDEN TO STORE ONLY ONE TYPE
		ArrayList<String> lst2 = new ArrayList<>();
		
		
	}

}
