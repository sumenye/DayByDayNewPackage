package May7;

import java.util.ArrayList;

public class UsingTypeComputer {

	public static void main(String[] args) {
		/*
		 * WHAT CAN WE DO WHEN  WE HAVE A CLASS?
		 * ---> Create object out of it 
      * It will become a type 
      * Create a reference variable Computer iMac
      * Use it as method parameter 
      * Use it as method return type 
      * Use it as type for ArrayList object
		 * */
		
		
		Computer myComputer = new Computer();
		ArrayList<String> lst = new ArrayList<>();
		
		ArrayList<Computer> comlst = new ArrayList<>();
		
		comlst.add(myComputer);
		comlst.add(  new Computer()  );
		
		String str = new String ("actual String");
		String[] strArr = new String[3];
		
		Computer myComp = new Computer();
		Computer[] comArr = new Computer[3]; //inside 3 null array object
		
		printComputer( myComp );
		
	}
	//we creatd a method that return computer object
	public static Computer getComputer() {
		//inorder to return computer object
		//first we need to create an object
		Computer iMac = new Computer();
		iMac.OS = "MacOS";
		return iMac; //returned computer object
	}
	
	//created a method that accept computer as parameter
	//so we call this method
	//we will pass computer object as argument
	public static void printComputer(Computer comObject) {
		System.out.println("computer object");
		
	}
	
	public static String getString() {
		return "mystring";
	}

}
