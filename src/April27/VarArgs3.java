package April27;

public class VarArgs3 {

	public static void main(String[] args) {
		// VarArgs ---> is represented in method parameter using ...
		//... CAN ONLY BE USED AS METHOD PARAMETERS
		//IT CAN ONLY BE USED ANYWHERE ELSE
		//calling a method that have varArg
		//we directly pass variable number of arguments
		// you may also pass an array---(not so common but possible)
		//What if we have more than one parameter in methods
	doSomething("magic horse", 1,2,3,4,45,5,6,7,8,8,9,9);
//	doSomethingElse(1,2,3,4,5, "magic horse");	
//	doSomethingElse(5, "magic horse");	
		
	}
	public static void doSomething(String name, int... nums) {
		System.out.println("do something was called");
		
	}
	//IF THERE ARE MULTIPLE PARAMETERS VARARG SHOULD BE THE LAST ONE
	//BECAUSE the number of the arguments is not certain
//	public static void doSomethingElse(int... nums, String name ) {
//		System.out.println("do something else was called");
//		
//	}
	/*
	 * 
     *   Multiple varargs in one method paramters are not allowed 
     *   you can have at most one varArg in one method 
     *   
     *   
     *   a method that takes varArg as parameter can accept a array object 
     *   as an argument 
     *    
     *   a method that takes array as parameter can not accept a varArg
     *   as an argument 
     *   
     * */

	
	
	
}
