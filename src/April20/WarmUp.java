package April20;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {		
/* 
 * Create few static methods with no return type with below name and logic

1, create a method called countFrom1To10
take no parameters 
print 1-10 in one line with space

2, create a method called countFrom1ToN
take 1 int as parameter  
print 1-N(number user passed) in one line with space

3, create a method called CountDown
take 1 int as parameter 
and count down till 1 in method body
 * */
		countFrom1To10();	
		countFrom1ToN(1);
		countFrom1ToN(7);
		CountDown(1);
		CountDown(8);
	}
	//TASK1	
	public static void	countFrom1To10() {
		for(int i=1; i<=10;i++) {
		System.out.print(i+" ");}
		System.out.println();
	}	
	//TASK2
	public static void	countFrom1ToN(int n) {
		//Scanner scan = new Scanner(System.in);
		//n=scan.nextInt();
		for(int i=1; i<=n;i++) {
			System.out.print(i+" ");}
		System.out.println();
	}
	//TASK3
	public static void	CountDown(int x) {
		//Scanner scan = new Scanner(System.in);
		//x=scan.nextInt();
		for(int i=x; i>=1;i--) {
			System.out.print(i+" ");}
		System.out.println();
	}

}
