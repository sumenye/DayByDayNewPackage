package June2;

public abstract class AbstractClassWithNoAbstractMethod {
	/*
	 * ABSTRACT METHOD MUST BE IN ABSTRACT CLASS
	 * 
	 * HOWEVER AN ABSTRACT CLASS DOES NOT HAVE TO HAVE AN ABSTRACT 
	 * 
	 * THE ONLY EFFECT OF MAKING THIS ABSTRACT AT THIS MOMENT
	 * IS TO PREVENT OBJECT IS BEING CREATED OUT OF THIS CLASS
	 * */
	
	public static void main(String[] args) {
	
		//AbstractClassWithNoAbstractMethod obj = new AbstractClassWithNoAbstractMethod();--> not compile
		
	}

}
