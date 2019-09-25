package May5;

public class Horse {
	
	//instance field/ variable to define properties /attribtes of objets
	//that being created out of this class
	
	
	String breed = "Spartan";
	int age = 5;
	String color = "black";
	double height = 25.6;
	
	public static void main(String[] args) {
		
		//each object attributes are completely different frim
		//any other objects that created from class
		Horse h1 = new Horse();
		
		h1.breed = "Spartan";
		h1.age = 5;
		h1.color = "black";
		h1.height = 25.6;
		
Horse h2 = new Horse();
		
		h2.breed = "Mongolian";
		h2.age = 4;
		h2.color = "black";
		h2.height = 5.6;

	
	System.out.println(h1.color);
	System.out.println(h2.color);
	
	//reassigned to new value
	h1.color = "brown";
	System.out.println(h1.color);
	System.out.println(h2.color);
	System.out.println(h1.breed +"\n"+ h1.age+"\n"+ h1.color+"\n"+h1.height);
	}
	
	

}
