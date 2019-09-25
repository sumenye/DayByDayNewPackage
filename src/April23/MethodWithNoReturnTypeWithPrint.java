package April23;

public class MethodWithNoReturnTypeWithPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Aliya";
		//name.charAt(0) actually return a value so println can prnt out
		System.out.println(name.charAt(0));
		//System.out.println(printSomething());//it does not generate a value, does not return a value while being run
//but println method is expecting a value so it does not compile
	}
	public static void printSomething() {
		System.out.println("CLASS IS OVER");
	}

}
