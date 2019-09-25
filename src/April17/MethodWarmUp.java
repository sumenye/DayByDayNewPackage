package April17;

public class MethodWarmUp {

	public static void main(String[] args) {
		sayHello();
		sayGoodBye();
		sayHelloTo("300 Spartans");

	}
	public static void sayHello() {
		System.out.println("Hello Spartans!!!");
		
	}
	
	public static void sayGoodBye() {
		System.out.println("Good bye Spartans!!");	
	}
	public static void sayHelloTo(String person) {
		System.out.println(person+", Hello!");
	}

}
