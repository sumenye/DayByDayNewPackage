package April20;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		// create a static void method called reportBiggerArray
		// it will take 2 int arrays as parameters 
		// inside body with will compare the size of array 
		// and print out array with bigger size 
		// for example {1,2,3}  {1,2,3,5} 
		    //--> second array is bigger and print [1,2,3,5]
		int[] arr1={3,5,8,9};
		int [] arr2 = {3,6};
		reportBiggerArray(arr1, arr2);
		reportBiggerArray(new int[] {1,8,0,3,2,1,3},new int[] {4,7,6});
		
	}
	
	public static void reportBiggerArray(int[] arr1, int[] arr2) {
		if( arr1.length>arr2.length) {
		System.out.println(Arrays.toString(arr1));	
		}
		else 
			System.out.println(Arrays.toString(arr2));	
	}

}
