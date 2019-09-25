package April13;

import java.util.Scanner;

public class ForEachExample {

	public static void main(String[] args) {
		
	    System.out.println("Please enter a word");

	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();

		
String[] splitted =word.split("");
for(String each : splitted)
{	System.out.print(each+"-");
	}
System.out.print(" ");

System.out.println("enter a sentence");


//THIS TIME SENTENCE
String sentence = scan.nextLine();
String[] words1 =sentence.split(" ");
for(String eachWord : words1) {
	System.out.print(eachWord);
}
}

}
