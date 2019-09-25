package May7;

public class Phone {
   /* Create class Phone
    * add few instance variable to define   attribute | properties| state of object 
    * type as String , OS as String , capacity as int 
    * add few methods 
    *    ring -->> accept no param return no value , just print ringing
    *   dial -->> accept one param number as long and print dialing number 
    * 
    * OPTIONALLY 
    *   add a behavior to Phone object  
    *   displayPhoneInfo method accept no param return no value 
    *   --> this should print all phone attributes 
    * 
    * 
    * Create another class called PhoneFactory with main method 
    * create 3 different phone object , iphone, sumsung , pixel 
    * assign value for all attributes 
    * and call methods 
    */
	
	String brand;
	String OS ;
	int capacity;
	//these instance variables can be accessed
	//inside methods directly
	//just like it'a a local variable for that method
	
	//if you are outside class you need an object to access these attributes
	
public void ring() {
	System.out.println("ringing");
}
public void dial(long number) {
	System.out.println("dialing");

}

public void displayBrand() {
	
System.out.println("brand: "+brand);	
}
}
