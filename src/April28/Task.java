package April28;

public class Task {

	public static void main(String[] args) {
		// create few static methods called addNums
		//first one take 2 numbers and add them
		//return the result as int
		// second one take the 3 numbers and add them
		//return result as int
		//third one take 4 numbers and add them
		// does not return a values
		//just print out the result
		System.out.println(addNums(5,7));
		addNums(5,7,9);
		
		addNums(5,7,8,9);

	}
	
	public static int addNums(int num1, int num2) {
		int sum = num1 + num2; 
		return sum;
	}
	public static int addNums(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3; 
		return sum;
	}
	public static void addNums(int num1, int num2, int num3,int num4) {
		int sum = num1 + num2 + num3+ num4; 
		System.out.println(sum);
	}

}
