package April24;

import java.util.Arrays;

public class ReturningMultipleValue {

	public static void main(String[] args) {

		int[] myArray = giveMeAnArray();
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(giveMeAnArray()));

	}
	public static int[] giveMeAnArray() {
		int[] arr=new int[] {1,2,3};
		//this method have no parameter
		//and return int array object as returned value
		return arr;
		//return Arrays.toString(arr); ---->> makes string so does not compile
	}

}
