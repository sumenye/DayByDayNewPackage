package March27;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	/*	int x = 0;//--->>it must be initialized before the loop.
		//if you dont give a value to x it never gets in the loop
		while (x!=5) {
			System.out.println("Give me five ");
			x = scan.nextInt();//as long as you dont give me five i will keep asking to give me five
		}
		System.out.println("YAY GOOD JOB");
//-------------------------------------------------------------
		int a; // it does not compile because both a and b does not get in the condition
		int b = 10; //a is not initialized and y is smaller than 15
		if(b>15) {
			a = 10;
			System.out.println(a);*/
//-----------------------------------------------------------		
			//System.out.println("Enter your bill:");
			int b = 0;
			while(!(b==5 || b==10)) {  //unless it is not 5 or 10 i will go on asking
				System.out.println("Enter 5$ or10$");
				b = scan.nextInt();
			}
			
			System.out.println("end of loop");
		
		}
		
	}


