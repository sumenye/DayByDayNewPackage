package April24;

public class ReturnWithParameters {

	public static void main(String[] args) {
		System.out.println(isAdult(16));
		System.out.println(isAdult(36));

	}
	//if a method that return a value of any type 
	//should not have any chance to not return value
	//or it will not even compile
	
	//you may have many return statement in different execution path
	//but you may only return one value
	public static boolean isAdult(int age) {
		if(age<18) {
			System.out.println("not adult");
			return false;
		}
		return true;
	}

}
