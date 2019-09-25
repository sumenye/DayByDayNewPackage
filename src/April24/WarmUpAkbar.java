package April24;
public class WarmUpAkbar {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 34, 5, 6 };
		int sum = getSum(nums);
		System.out.println("sum of all the numbers: " + sum);
		System.out.println(getSum(new int[] { 1, 3, 4, 5, 1, 1, 1, 1 }));
		
		//directly passing parameter value and directly printinh the 
	    // outcome without storing them  
	    //System.out.println( getSum( new int[] {1,3,4,5,1,1,1,1} ) ); 
		
		System.out.println(getMax(nums));
	}

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int each : arr) {
			sum += each;
		}
		return sum;
	}
	public static int getMax(int []arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			}
		return max;
		}
	}

