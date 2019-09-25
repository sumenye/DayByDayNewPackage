package March30;

import java.util.Scanner;

public class March30WarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("Please enter a sentence:");
String sentence = scan.nextLine();

while(!sentence.toUpperCase().contains("JAVA")) {
	//while(!sentence.toLowerCase().contains("java")){
	System.out.println("Please enter a sentence");
	sentence = scan.next();
}
	System.out.println("YOU GOT IT, YOU LOVE JAVA");	
	}

}
