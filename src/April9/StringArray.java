package April9;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// create a string array with the capacity of 4
		// put your favoirate movie/show in
		// 1.first use loop to print them out
		// 2.print the length of all items
		// 3.get the max length movie title

		String[] str = new String[4];
		str[0] = "Life";
		str[1] = "without";
		str[2] = "love is";
		str[3] = "meaningless";
		System.out.println(Arrays.toString(str));
		System.out.println(str.length);// this statement gives the index count of array object
//the length property of array object
		System.out.println(str[0].length());// this gives char count of string
//length is an array property but length() is a string method
		for(int i=0; i<=str.length-1;i++) {
			System.out.println(str[i]+"char count is " + str[i].length());
		}
		int max = str[0].length();
		int index = 0;
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>max) {
				max = str[i].length();
				index = i;
			}
		}
		System.out.println(max);//will give the maximum length
///------------3rd task----------------------------
		//in the curly braces of the conditional if statement we ad another 
		//system.out.println(str[i].
		
		System.out.println("longest index: "+ str[index]);
	}

}
