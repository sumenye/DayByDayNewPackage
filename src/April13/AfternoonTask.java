package April13;

import java.util.*;

public class AfternoonTask {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
				for (int i=0; i<5;i++) {
				nums[i] = scan.nextInt();}
				int max=0;
				
				for(int i=0;i<nums.length; i++) {
					if(nums[i]>max) {
						max = nums[i];
					}
				}
				System.out.println(max);
				int min = nums[0];
				for(int i=0;i<nums.length; i++) {
					if(nums[i]<min) {     // ???????
						min = nums[i];
					}
				}
				System.out.println(min);
				int sum = 0;
//				for(int i=0;i<nums.length; i++) {
//					sum = sum+nums[i];
//					}
				
				for(int each : nums) {
					sum =sum+each;
				}
				
				System.out.println(sum);


}
}
