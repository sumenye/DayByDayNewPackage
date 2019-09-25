package April13;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Enter a word:");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		char []eachChar = str.toCharArray();
		for(char character : eachChar) { // you can give any name to your char
			System.out.print(character+" ");
			
		}
		
	}

}
