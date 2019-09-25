package April14;

import java.util.Arrays;

public class TeoDArrayExample {

	public static void main(String[] args) {
		

		int[] nums1 =new int[] {1,3,5};
		int[] nums2 =new int[] {1,13};
		//2 dimensional array is an array object store 1 dimensional array in each slot
		
		int[][] numsOfNums = new int[2][];
		// length method on an array will always return first dimension length
		 System.out.println( numsOfNums.length );
		numsOfNums[0] =nums1;
		numsOfNums[1] =nums2;
		
		for(int i=0; i<numsOfNums.length; i++) {
			System.out.println(Arrays.toString(numsOfNums[i]));
			System.out.println(numsOfNums[i].length);
			
		}
		
		}

}
