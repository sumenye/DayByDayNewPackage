package April23;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isAdultOrNot(19);
		System.out.println(result);
		System.out.println(isAdultOrNot(21));
		System.out.println(isAdultOrNot(11));
		isAdultOrNot(27);
		isAdultOrNot(6);
		
		Scanner scan = new Scanner(System.in);
		
		

	}
	public static boolean isAdultOrNot(int age) {
		
//		if(age>18){
//			return true;}
//			else {
//				return false;}
		return age>18;
		}
	}


