package April7;

public class ArrayTasks {

	public static void main(String[] args) {
		
	 // print them out using the loop 
		      // get the sum of all numbers 
		      // get the max number 
	    int nums []= {1,4,6,8,9};
		    
		    int sum = 0 ; 
		    for (int i = 0; i < nums.length; i++) {
		      
		      sum = sum + nums[i] ; 
		      
		    }
		    System.out.println(sum);
		    //----------------FINDING MAX--------
		    int max = nums[0];
		    for(int i =0; i<nums.length;i++) {
		    	if(nums[i]>max) {
		    		max = nums[i];
;		    	}
		    }
		    System.out.println(max);
		    /**max is num[0]=1 at first
		     * iteration 1 --->  4>1--->max=4
		     * iteration 2------>6>4---->max is 6 now
		     * iteration 3------>8>6---->max is 8 now
		     * iteration 4------>9>8---->max is 9 now
		     * // we assume the first item is the max 
     * then compare the first item to the rest of them 
     * and replace the value of max with actual max number
     * in each iteration 
		     * 
		     * */
		 }
		  
		}
