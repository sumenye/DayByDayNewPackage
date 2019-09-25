package May14;

public class House
{
	
	private String type;
	private int bedroom;
	private double price;
	
	// POJO CLASS
	// PLAIN OLD JAVA OBJECT 
/*
 * It has privates fields to represent object's attribute 
 * it has public getters and setters 
 * it has constructors to set all the field value 
 * it has toString method to return String representation of the object 
 *   in nice format with all fields value 
 * 
 * 
 * */
	
	public House() {
		
	}
	public House(String type, int bedroom, double price) {
		this.type=type;
		this.bedroom=bedroom;
		this.price=price;	
	}
	
	public String toString() {
		return "House [type=" + type + ", bedroom=" + bedroom + ", price=" + price + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	/*Create a class called MathEquation 
	add 4 private fields 
		oprand1 , oprand2 , result as double 
		operator as char 

	Encapsulate first 3 fiels 
		with getters and setters
		provide only setter for operator field

	Create no arg constructor 
		just print out message from no Arg 

	create 1 arg constructor 
		set the operator value 

	create 3 args constructor 
		set all 3 fields value 

	create a void instance method with no parameter
		set the result value 
			according to oprand1 oprand2 operator
			if operator is + - * / 
				calculate result 

	Create toString method to return all fields value */
}
