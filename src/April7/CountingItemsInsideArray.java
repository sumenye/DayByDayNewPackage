package April7;

import java.util.Arrays;

public class CountingItemsInsideArray {

	public static void main(String[] args) {
		// TASK:
		int[] nums = {1,55,7,898,9,55};
		//print out the array to see what's inside
		//find the count of numbers more than 100
		String str = Arrays.toString(nums);
		System.out.println(str);
		int moreThan = 0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]>100) {
				moreThan++;
			}
		}
System.out.println(moreThan);
	}

}
