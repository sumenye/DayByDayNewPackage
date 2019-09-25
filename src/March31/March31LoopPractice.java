package March31;

import java.util.Scanner;

public class March31LoopPractice {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
String name = scan.next();

/*
//char c = name.charAt(0);
String firstUpper = name.substring(0,1).toUpperCase();
String expected = firstUpper + name.substring(1); // here is important***
System.out.println(expected);*/
int x = 0;

do {
	System.out.print(name.charAt(x)+" ");
	x++;
}while(x<name.length());



		
	}

}
