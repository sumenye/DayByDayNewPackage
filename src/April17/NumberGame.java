package April17;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		printTheDoubleNumber();
		checkForAge(20);

	}
	public static void printTheDoubleNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int number =scan.nextInt();
		System.out.println(number*2);
	}
	public static void checkForAge(int age) {// the words in the paranthesis are method parameter 
		//Scanner scan = new Scanner(System.in);
		//System.out.println("enter your number");
		//age =scan.nextInt();
		if(age>18) {
			System.out.println("adult");}
			else {System.out.println("not an adult");}
		
		
	

}
}
