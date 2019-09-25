package April14;

import java.util.Arrays;

public class FillMethod {

	public static void main(String[] args) {
		int[] number = new int[20];
		Arrays.fill(number, 5);
		//THIS WIIL GIVE YOU AN ARRAY FULL OF FIVE
		System.out.println(Arrays.toString(number));
	}

}
