package April17;

public class ReverseStringInMethod {

	public static void main(String[] args) {
		reverseString("abc");
		reverseString("Orville");
		reverseString("Java");
		reverseString("WestWorld");

	}
	public static void reverseString(String str) {
		for(int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
