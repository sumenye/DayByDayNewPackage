package April24;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
		arr[i]=scan.nextInt();}
		
		
     System.out.println(getSum(arr));
		
	}
	
	public static int getSum(int arr[]) {
		int arrTotal=0;
	
		for(int i=0;i<arr.length;i++) {
		arrTotal = arrTotal + arr[i];
		}
		return arrTotal;
	}

}
