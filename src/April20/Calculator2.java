package April20;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTwoNumber(5, 7);
		subtractTwoNumber(5, 7);
		multiplyTwoNumber(5, 7);
		divideTwoNumber(5, 7);
		moduleOfTwoNumbers(5, 7);
	}

	public static void addTwoNumber(int a, int b) {
		System.out.println("sum of a and b is: " + a + b);
		System.out.println();
	}

	public static void subtractTwoNumber(int a, int b) {
		System.out.println("subtraction of a and b is: " + (a - b));
		System.out.println();
	}

	public static void multiplyTwoNumber(int a, int b) {
		System.out.println("multiplication of a and b is: " + a * b);
		System.out.println();
	}

	public static void divideTwoNumber(int a, int b) {
		System.out.println("division of a and b is: " + a / b);
		System.out.println();
	}

	public static void moduleOfTwoNumbers(int a, int b) {
		System.out.println("remainder of division of a and b is: " + a % b);
		System.out.println();
	}

}
