package April20;

public class Calculator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate('+', 35, 7);
		calculate('-', 35, 7);
		calculate('*', 35, 7);
		calculate('/', 35, 7);
		calculate('%', 35, 7);

	}

	public static void calculate(char operator, int num1, int num2) {
		switch (operator) {
		case '+':
			System.out.println("result of addition: " + (num1 + num2));
			break;
		case '-':
			System.out.println("result of subtraction: " + (num1 - num2));
			break;
		case '*':
			System.out.println("result of multiplication: " + (num1 * num2));
			break;
		case '/':
			System.out.println("result of division: " + (num1 / num2));
			break;
		case '%':
			System.out.println("remainder of division: " + (num1 % num2));
			break;
		default:
			System.out.println("invalid operator");
		}
	}

}
