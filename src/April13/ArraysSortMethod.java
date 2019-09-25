package April13;

import java.util.Arrays;

public class ArraysSortMethod {

	public static void main(String[] args) {
		int [] nums = {1, 4, 5, 77, 2, 45};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums); // sorting the numbers
		System.out.println(Arrays.toString(nums));
		for(int item : nums) {
			System.out.println("numbers of our array are: "+item);
		}
		
	}

}
