package April23;

public class ReturnedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//giveMeLastChar("ABDUL KHAN");
		// If the method with return type is being called 
	    // and result is not stored , it will be just lost in next statement 
		// printing on the console is not same thing as returning a value 
		char cLast=giveMeLastChar("ABDUL KHAN");
		System.out.println();
		System.out.println(cLast+""+cLast);
	}
	
	public static char giveMeLastChar(String name) {
		
		char last = name.charAt(name.length()-1);
		System.out.println(last);
		return last;
		
	}

}
