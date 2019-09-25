package May15;

public class Caller {
	// calling a Constructor 
	/*
	 * Where :   when object is being created 
	 *     a constructor can only be called inside another constructor of same class
	 *     RULE : 
	 *       this(arg...)    use this keyword with () and pass arguments if needed
	 *       1, it has to be in first statement of constructor body 
	 *       2, ONLY ONE Call(of any consrtuctor) is allowed inside one constructor 
	 *       3 , recursive constructor call is not allowed --- COMPILER ERROR*/
	
	public Caller() {
		this(100);
		System.out.println("calling no arg");
	}
	
	public Caller(int x) {
		//this();----> recursive constructors does not compile
		System.out.println("calling 1 arg");
	}

}
