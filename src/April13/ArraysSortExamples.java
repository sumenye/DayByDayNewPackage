package April13;

import java.util.Arrays;

public class ArraysSortExamples {

	public static void main(String[] args) {

		String name = "CyberTek2019";
		char[] nameChars = name.toCharArray();
		Arrays.sort(nameChars);
		System.out.println(Arrays.toString(nameChars));

//----------NO SORTING WITH BOOLEAN------------------
		String[] names = {"abc", "efg", " ", "123", "Ku"};
		Arrays.parallelSort(names);
		System.out.println(Arrays.deepToString(names));
		
		//sorting a string array, it is based on first character
		//ASCII Code value low to high
		//--->most of the special chars--->numbers---> uppercases---->lowecases
		
//----------WHAT IF THE MULTIPLE ITEMS HAVE SAME FIRST CHAR----------
		//IT WILL MOVE TO COMPARE THE NEXT CHARACTER
		String [] names1 = {"abc", "afz", "afZ"};
		Arrays.parallelSort(names1);
		System.out.println(Arrays.deepToString(names1));
		
	}

}
