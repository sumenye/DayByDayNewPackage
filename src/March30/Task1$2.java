package March30;

import java.util.Scanner;

public class Task1$2 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
System.out.println("Please enter a string");
String sentence = scan.nextLine();
char firstChar = sentence.charAt(0);
char lastChar = sentence.charAt(sentence.length()-1);
if(firstChar >= '0' && firstChar <= '9')
	System.out.println("your sentence starts with a number");
else if (lastChar>='A' && lastChar<='Z')
	System.out.println("your sentence ends with uppercase");
else 
	System.out.println("your sentence does not start with a number or does not end with uppercase");
	}

}
