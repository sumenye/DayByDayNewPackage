package March30;

import java.util.Scanner;

public class TaskHomeWork {

	public static void main(String[] args) {
		//Create a program that ask user a sentence (may or may not contain number) 
		//and store numerical and non-numerical part separately and print out the results. 
		//Also print out the count of the characters from a-z
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a sentence:");
	String cumle = scan.nextLine();
	String numeric = "";
	String nonNumeric = "";
	char c;
	int numberofLetter = 0;
	int uzunluk = cumle.length();
	int i=0;
	do {
		c=cumle.charAt(i);
		if(c>='0' && c<='9') {
			numeric = numeric +c;
			i++;
		}
		else if (c>='a' && c<='z') {
			nonNumeric = nonNumeric+c;
			numberofLetter ++;
			i++;
		}
	} while (i<uzunluk);
	System.out.println("Numeric characters: "+numeric);
	System.out.println("nonNumeric characters: "+nonNumeric);
	System.out.println("Number of letters: "+numberofLetter);

	}

	}


