package April14;

import java.util.Arrays;

public class BinarySearchMethod {

	public static void main(String[] args) {
		

		int[] nums = {1, 3, 5, 6, 8, 9};
//-----****----array object must be sorted before using this method------************
		int[] nums1 = {112, 2223, 5, 623, 8222, 9};

	int index = Arrays.binarySearch(nums,9);
	int index1 = Arrays.binarySearch(nums1,9);
	//searching of certain index of certain item
	System.out.println(index);
	System.out.println(index1);
		
	}

}
