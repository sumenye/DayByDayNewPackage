package April17;

import java.util.Scanner;

import April16.Spartan;

public class Utility {

	public static void main(String[] args) {
		printUsersName();//calling the method
		
	Utility.printUsersName();
	Spartan.releaseTheHorse();// called and imported the Spartan from another package
}
	 // We can call methods coming from 
    // different classes 
    // if the class is under same package no import needed
    // if the class is under different package import is mandatory
public static void printUsersName() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name please");
	String name =scan.next();
	System.out.println("You entered : "+name);
		//
}

}
