//WE CHANGED OUR PACKAGE TO MAY24. VEHICLE CLASS IS IN MAY25
//SO WE IMPORTED IT
//PROTECTED FIELD YEAR IS ACCESSABLE 
// SO WE USED IT WITHOUT ANY COMPILATION
package May24;
import May25.Vehicle;

public class Airplane extends Vehicle{
	
	private int wingCount;
	
	 public Airplane(String brand, String model, int year, int wingCount) {
		    
		    super(brand, model, year);
		  
		    this.wingCount=wingCount;
		  }
		  
		  public int getWingCount() {
		    return wingCount;
		  }

		  public void setWingCount(int wingCount) {
		    this.wingCount = wingCount;
		  }

		  @Override
		  public String toString() {
		    return "Ariplane [wingCount=" + wingCount + ", year=" + year + ", getWingCount()=" + getWingCount()
		        + ", getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", toString()=" + super.toString()
		        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		  }

		  public static void main (String[] args) {
		    
		    Airplane a1= new Airplane("boeing ", "737", 2020, 4);
		    System.out.println(a1.toString());
		    System.out.println(a1.year);
		    
		    Vehicle v1 = new Vehicle("F35","730", 2021);
		    System.out.println(v1.toString());
		  }
		  
		  boolean   bValue =  9 > 10  || 10 > 9; 
		
		}