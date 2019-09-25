package April10;

import java.util.Arrays;

public class SplittingTheString {

	public static void main(String[] args) {

		String str = "Java is fun and java is challenging";

		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		String[] parts = str.split("a");
		System.out.println(Arrays.toString(parts));
		String[] parts2 = str.split("is");
		System.out.println(Arrays.toString(parts2));
	}

}
