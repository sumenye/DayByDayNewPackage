package March27;

import java.util.Scanner;

public class TaskWhileloop {

	public static void main(String[] args) {
		
		 // create a dynamic counter program 
	    // ask user a number 
	    
	    // if user enter 5  ---->>> 1 2 3 4 5
	    // if user enter 7  ---->>> 1 2 3 4 5 6 7 

		int y = 10;
		while (y > 5) {
			System.out.println("do this " + y);
			y--;
		}

		int i = 1;
		while (i <= 10) {
			System.out.print(i++ + " ");
		} // -------->not println, just print..
		// so it will write everything in one line

//TASK
		Scanner scan = new Scanner(System.in);
	
		System.out.println();
		System.out.println("ENTER YOUR TARGET NUMBER:");
		int targetCount = scan.nextInt();
		int x = 1;
		while (x <= targetCount) {
			System.out.print(x + " ");
			x++;
		}

	}
}
