package April2;

import java.util.Scanner;

public class April2Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2 numbers addition is more than 100
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
	for(int i=0; ;i++)	{
		System.out.println("Enter two numbers:");
		x= scan.nextInt();
		y= scan.nextInt();
	sum=x+y;
	if(sum>100) {break;}}
	System.out.println("THE END, SUM IS MORE THAN 100");
		
	}

}
