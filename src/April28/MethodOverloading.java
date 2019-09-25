package April28;

public class MethodOverloading {

	public static void main(String[] args) {
		/*
		 * 
		 * can I use same method name for different methods?
		 * 
		 * YES
		 * THANT'S CALLED METHOD OVERLOADING
		 * 
		 * 
		 * 
		 */
		printName();
		printName("JAVA ");
		printName("JAVA ", "SPARTAN");

		
		System.out.println();
	}

	public static void printName() {

		System.out.println(" Method Overloading ");
	}

	public static void printName(String name) {

		System.out.println(" Method Overloading " + name);
	}
	public static void printName(int number) {

		System.out.println(" Method Overloading " + number);
	}

	public static void printName(String firstName, String lastName) {

		System.out.println(" Method Overloading " + firstName + lastName);
	}

}
