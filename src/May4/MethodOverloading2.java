package May4;

public class MethodOverloading2 {

	public static void main(String[] args) {

//		Integer num = new Integer(100);
//		doSomething(num);
		
		doSomething(100);
		
		doSomething(Integer.valueOf(100));
		
		doSomething(null);
		
//		Integer x = 100;
//		doSomething(x);
	}
	
	public static void doSomething(int x) {
	System.out.println("doSomething(int x)");	
	}

	public static void doSomething(Integer x) {
		System.out.println("doSomething(Integer x)");
	}
	

}
