package April27;

public class VarArgs {

	public static void main(String[] args) {
		// Vararg ---> variable number of arguments
		
		//we are passing 2 external data to a method
		//that have two parameters
		
		//we are passing 2 arguments to a method
		//that have 2 parameters
		
		           //arguments
		add2Numbers(10,12);
		add3Numbers(10,12,20);
		addManyNumbers( new int [] {1,4,66,33} );
		// I want to have a method that I don't need to know how many argument will be used...
				//VARARG METHOD DOES IT
		addManyNumbers2(1,4,5,6,7,8,9,90);
		addManyNumbers2(1,4,5,6,7);
		addManyNumbers2(1,4);
		addManyNumbers2(1,444, 55, 777);
	}
		//------------------------------
		//VarArgs ----> is used to create a method
		//that can take variable numbers of argument of same type 
		//when being called
	//varArg parameter is represented by using 
	//... after method parameter data type
	//and IT CAN ONLY BE USED GERE !!!
		//---------------------------------
		
		public static void addManyNumbers2( int... manyNums) {
			int sum1=0;
		
			for(int eachNum1 : manyNums) {
				sum1+=eachNum1;}
		System.out.println(sum1);	
	
		
	}
	
	public static void addManyNumbers(int[] manyNums) {
		int sum=0;
		for(int eachNum : manyNums) {
			sum+=eachNum;
		}
	}
	
	//method parameters
	public static void add2Numbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void add3Numbers(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}


}
