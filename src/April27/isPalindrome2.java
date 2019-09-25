package April27;

public class isPalindrome2 {

	public static boolean isPalindrome(String target) {

		String reversed = "";
		target = target.replaceAll(" ", "");

		for (int i = target.length() - 1; i >= 0; i--) {

			reversed += target.charAt(i) + "";
		}
		return reversed.equals(target);
	}

	public static String reverseString(String target) {
		String reversed = "";
		for (int i = target.length() - 1; i >= 0; i--) {
			reversed += target.charAt(i) + "";
		}
		return reversed;
	}

	public static boolean isPalindrome2(String target) {

		String reversed = reverseString(target);
		target = target.replaceAll(" ", "");
		reversed = reversed.replaceAll(" ", "");

		return reversed.equals(target);
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome2("hannah"));
		System.out.println(isPalindrome2("race car"));
		System.out.println(isPalindrome2("was it a car or a cat  i saw"));
		System.out.println(isPalindrome2("myname"));

	}

}
