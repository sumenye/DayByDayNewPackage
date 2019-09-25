package April13;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		//Task1 : 
//		create an array of int with 5 items , return true if all items are more than 10
//		return false if not
//		Scanner scan = new Scanner(System.in);
//		boolean b = true;
//		int [] number = new int[5];
//		System.out.println("Enter 5 numbers:");
//		for (int i=0; i<5;i++) {
//			number [i] = scan.nextInt();}
//		for (int i=0; i<5;i++) {
//			if(number [i] <10) {b=false;}
//			}
//		
//		System.out.println(b);
//		
//
//	//Task 2 :
//	given : 
//	String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		String arr = "Cybertek Batch Spartan is most hardworking Batch ever";
		String [] arr1 = arr.split(" ");
		
//	for(int i=0; i<arr1[0].length(); i++) {
//		
//
//		System.out.print(arr1[0].charAt(i)+"-");}
//		System.out.println();
//		for(int i=0; i<arr1[1].length(); i++) {
//			
//			System.out.print(arr1[1].charAt(i)+"-");}
		
		for(int j=0;j<arr1.length;j++) {
		for(int i=0; i<arr1[j].length(); i++) {
			System.out.print(arr1[j].charAt(i)+"-");}
		System.out.println();}
		
		

		
//
//	use the method your learned to get each words
//	and store it into String array: 
//
//	loop through each items -- 
//	  in each iteratrion loop : 
//	  	 turn each word into char array 
//	  	 print each char out with seperated by -
//	output : 
//		C-y-b-e-r-t-e-k-
//		B-a-t-c-h-
//		S-p-a-r-t-a-n-
//		i-s-
//		m-o-s-t-
//		h-a-r-d-w-o-r-k-i-n-g-
//		o-n-e-
//		e-v-e-r-
//
//	// Optional : Reverse each word in sentence
//	your output should be 
//	ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve
		System.out.println();
		
		for(int j=0;j<arr1.length;j++) {
			for(int i=arr1[j].length()-1; i>=0; i--) {
				System.out.print(arr1[j].charAt(i));}
			System.out.println();}	

	}

}
