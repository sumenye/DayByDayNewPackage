package May12;

public class Vehicle {

/*Create a class called Vehicle 
with few private fields model , make , speed 
create getters and setters for all those private fields 

create methods : 
	increaseSpeed : it accepts one parameter increaseBy as int 
	and increase the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->

	decreaseSpeed  : 
	it accepts one parameter decreaseBy as int 
	and decrease the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->
	*/
	private String make;
    private String model;
    private int year;
    private String color;
    private int speed;
    

	//select source
    //select generate getters and setters
    //check the checkbox for the field you wanna
    //then close generate
	  public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void increaseSpeed(int increaseBy) {

		    // speed = speed + increaseBy;
		    for (int i = 1; i <= increaseBy; i++) {

		      speed++ ;
		      System.out.print(speed + "->");
		    }

		    System.out.println();

		  }
		  
		  public void decreaseSpeed(int decreaseBy) {
		    
		    for (int i = 1; i <= decreaseBy; i++) {

		      speed-- ;
		      System.out.print(speed + "->");
		    }

		    System.out.println();

		    
		  }
		  
		  public void stop() {
			 // speed=0; --->direct way
			  //this.speed = 0; --->using keyword
			  setSpeed(0); //---> using methods created before
			 // this.setSpeed(0); ---we can also use with methods
		  
		  }
}
