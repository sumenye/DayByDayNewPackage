package June1;

public class FinalInstanceField {
	
	//FINAL FIELDS MUST BE INITIALIZED BEFORE THE OBJECT CREATION COMPLETED

	//final int NUM;---> final fields have to be initialized first, 
	//you can not declare them without initialization
	final int NUM = 100;
	final int NUM2; // Assigned a value in initializer block
	final int NUM3;  //initialized in constructor
	{
		NUM2 = 200;
	}
	public FinalInstanceField(){
		NUM3 = 300;
	}
	
	private int getNumber() {
		return 150;
	}
	

	public static void main(String[] args) {
		
		//local final variables does not have to get initial value
		//IF NOT USED
		
		//local final variable cannit be reassigned once it get initial value

		final int x;
		x = 20;
		//x = 30;
		System.out.println(x);
		
		
		FinalInstanceField f1 = new FinalInstanceField();
		System.out.println(f1.NUM);
		System.out.println(f1.NUM2);
		System.out.println(f1.NUM3);
		
		
		
		//f1.NUM = 200; ---> can not reassign value for final variable
		
		System.out.println("THE END");

	}

}
