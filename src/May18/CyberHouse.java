package May18;

public class CyberHouse {
	
	int houseNumber;
	String design;
	
	//static fields/variable
	//class variable
	  // we can change the default value here if needed
	  // just like instance variables 
	static String neighbourhoodName;
	
	public CyberHouse(int houseNumber, String design) {
		this.houseNumber=houseNumber;
		this.design=design;
		/*
static variable|field  | class variable 
  It has single copy among all instances 
  every objects created out of the class 
  will have 1 single value to share
  
Where can we access it in same class : 
  
  -- constructor 
  -- static methods 
  -- instance method 
  
  Bottom line is -->> everywhere in same class  
		 * */
	}

}
