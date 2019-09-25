package April16;

public class Spartan {
//	method is created inside class
//	it should not be inside any method(like main method)
//	method is an action---> always named like doSomething, as verb
	//method name just like variable name always start with
	//lowercase by convention, use camelCase for multiple words
	
	public static void releaseTheHorse() {
		System.out.println("RELEASE IT NOW PLEASE!");
		System.out.println("GO!");
	}
	
	public static void holdYourHorse() {
		String owner = "Ahmed";
		System.out.println(owner +" hold your horse please!");
	}
	
	public static void main(String[] args) {
		Spartan.releaseTheHorse();
		Spartan.releaseTheHorse();
		//if you are in same class where the method is defined className is optional
		releaseTheHorse();
		
		Spartan.holdYourHorse(); 
		//OR holdYourHorse();
		
		
		//release the horse
		
		// we will start with 
		/*  method that does not take external data
		 * method that does not return  any value
		 * method that does not need an object to be called
		 * 
		 * 
		 
		 Arrays.toStrin(arr);
		 Spartan.releaseTheHorse():
		
		 public ---  access modifier --->to define where it can be used
		 static --- non-access modifier
		            if defined, it means no object needed to call this 
		 void--- it means this method only take action and does not return any value
		 
		 
		 */
	
		}
	
	}

