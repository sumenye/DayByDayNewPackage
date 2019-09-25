package April27;

import java.util.Arrays;

public class TwoDArrayMethod {

	public static void main(String[] args) {
		// Task2
		//create a method that takes 
		//called twoDPrinter
		//accept one 2D int array object as parameter
		//and print them all out in excel like row and column 	 
		//create a method called get2DArray
		//accept 2 int as parameters , row, col
		//return 2D array object in below logic : 
		//get2DArray(2,3) --->> { {1,2,3},{1,2,3} }
		int[][] twoDArrObj = {  {2,3,7} , {4,8,9} };
		//System.out.println(Arrays.deepToString(twoDArrObj));
		get2DArray(twoDArrObj);

	}
	public static void get2DArray(int[][] twoD){
	//System.out.println(Arrays.deepToString(twoD));
		for(int[] eachArr : twoD) {
			for(int eachNum : eachArr){
				System.out.print(eachNum+" ");
			}
		System.out.println();
	}
	
	}

}
