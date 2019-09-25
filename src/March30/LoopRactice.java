package March30;

import java.util.Scanner;

public class LoopRactice {

	public static void main(String[] args) {	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = scan.nextLine();
	int count = name.length()-1;
	while (count>=0) {
	System.out.print(name.charAt(count)+" ");	
	count--;
	}
	}
}
