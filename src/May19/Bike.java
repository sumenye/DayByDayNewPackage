package May19;

public class Bike{

	
	private String brand;
	private int id;
	private int gear;
	private int speed;
	private static int countOfBike;
	public String getBrand() {
		return brand;
	}
	public int getId() {
		return id;
	}
	public int getGear() {
		return gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	public Bike(String brand,int gear,int speed  ) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
//		countOfBike++;
//		this.id =countOfBike;
	}
	
	private Bike() { 
	//System.out.println("no arg is being called");
	countOfBike++;
	this.id =countOfBike;
	}
	
	
	public void speedUp(int increaseBy) {
		speed+=increaseBy;	
	}
	public void slowDown(int decreaseBy) {
		speed-=decreaseBy;	
	}

	public String toString() {
		return "Bike [brand=" + brand + ", id=" + id + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	public static void showCurrentCount() {
		System.out.println("current count of object is: "+countOfBike);
	}
	
	  public static void resetCount() {
		    countOfBike = 0 ; 
		  }
	
	
/*WARM UP 
	Create a class called Bike 
		private instance fileds : brand, gear, speed , id
		private static field : countOfBike 

		provide getters for all instance fields 
		privide setters for brand, gear, speed

		create 3 args constructors 
			to set brand, gear, speed
			and keep the count of objects here
			set the id value by the count of object to stimulate incremented ID for each objects 
			call your no arg constructor in here

		create private no arg constructor  
			print out no arg is being called 

	create instance methods
			speedUp : accept one increaseBy as int 
					return nothing , it will increase current speed by the amount provided

			slowdown : accept one decreaseBy as int 
					return nothing , it will decrease current speed by the amount provided
			toString method as usual 

	create static methods showCurrentCount
		accept no arg and just print out static variable 

*/
	
	
}
