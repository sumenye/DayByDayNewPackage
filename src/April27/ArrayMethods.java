package April27;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// create a static method called getArrayFrim1toX
		//it takes one parameter and return array 
		//starting from 1 to the number specified
		//getArrayFrum1toX(5)---->{1,2,3,4,5}
		getArrayFrum1toX(5);
		getArrayFrum1toX(20);
		getArrayFrum1toX(10);//here we just use the data
		int num=7;
		int[] resultArr = getArrayFrum1toX(num);//here we store the data
		System.out.println(Arrays.toString(resultArr));

	}
	public static int[] getArrayFrum1toX(int num) {
		int[] arr=new int[num];
		for(int i=0; i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
