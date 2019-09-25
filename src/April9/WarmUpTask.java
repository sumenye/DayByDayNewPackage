package April9;

import java.util.Arrays;

public class WarmUpTask {

	public static void main(String[] args) {
		
int[] nums = new int[50];
for(int i=0;i<50;i++) {
	nums[i]=i+1;
System.out.print(nums[i]+" ");
}
int[] evenums = new int[50];
System.out.println();
for(int i=0;i<50;i++) {
	evenums[i]=i*2;

}
//to see whats inside basic way 
System.out.print(Arrays.toString(evenums));
}
		
	}

