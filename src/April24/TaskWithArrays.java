package April24;

import java.util.Arrays;

public class TaskWithArrays {

	public static void main(String[] args) {
		/*
		 * create a static method called combineArray
		 * it takes 2 double array as parameters 
		 * and return another double array with 2 array items combined
		 * */
		System.out.println(Arrays.toString(combineArray()));

	}
	public static double[] combineArray() {
	double [] arr1 = {1.1,3.9,2.2};
	double [] arr2 = {2.4,2.88};
	double[]concatarray = new double[arr1.length+arr2.length];
	int i =0;
	for(double each:arr1) {
		concatarray[i]=each;
		i++;}
	for(double each:arr2) {
		concatarray[i]=each;
		i++;}
	
	return concatarray;
	
	}

}
/*
 * int[] concatArray(int[] a, int[] b) {
  int[] c = new int[a.length + b.length];
  int i = 0;
  for (int x : a) { c[i] = x; i ++; }
  for (int x : b) { c[i] = x; i ++; }
  return c;
}
 * 
 * */
