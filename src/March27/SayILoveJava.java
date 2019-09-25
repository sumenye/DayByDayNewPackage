package March27;

import java.util.Scanner;

public class SayILoveJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String theAnswer = "";
		while(!theAnswer.equalsIgnoreCase("yes")) {//
			System.out.println("DO YOU LOVE JAVA?");
			theAnswer = scan.next();
		}
		System.out.println("FINALLY, CORRECT ANSWER!");
	}

}
//try this un