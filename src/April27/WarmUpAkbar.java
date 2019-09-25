package April27;

public class WarmUpAkbar {

	public static void main(String[] args) {
		// a function to test a String is palindrome
		//statuc methid called isPlaindrome
		//it takes one string as a parameter
		//return boolean 
		//for example: ana, level,race car,
//		Scanner scan
//		String str= scan.nextline();
		System.out.println(isPalindrome("ana"));
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("race car"));
		System.out.println(reverseString("friend"));
		

	}
	public static boolean isPalindrome(String str) {
		String reversed = "";
		if( str.contains(" ")) {
			str=str.replace(" ","");}
		for(int i=str.length()-1; i>=0;i--) {
			
			reversed = reversed + str.charAt(i);
		}
		if(reversed.equals(str)) {
		return true;}
		else {
			return false;}
		
	}
	
	public static String reverseString(String target) {
		String reversed = "";

		for(int i=target.length()-1; i>=0;i--) {
			reversed = reversed + target.charAt(i);
		}	
		return reversed;
	}

}
