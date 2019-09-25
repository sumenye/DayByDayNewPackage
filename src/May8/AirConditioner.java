package May8;

public class AirConditioner {
	
	/* WARM UP 
	  Create a class called AirContitioner 
	  Add instance fields 
	    brand as String 
	    currentTemp as float  
	    isOn as boolean  

	  Add below behaviors 
	    displayTheBrand() ;
	      accept no paramter and print out the brand  
	    showCurrentTemp
	      accept no paramter and
	      simply display current temp on console 

	    displayAllInfo 
	      accept no paramter and display all AC info 

	    turnOn 
	      accept no parameter 
	      and set isOn value to true if it's not already true

	    turnOff 
	      accept no parameter 
	      and set isOn value to false if it's not already true
	    
	    increaseTemp
	      it accepts one parameter int 
	      and increase the value by the amount passed

	    decreaseTemp
	      it accepts one parameter int 
	      and increase the value by the amount passed
	    
	    setTemperature
	      it acceps one paramter int 
	      and set the value to that paramter passed 

	  Create a class called ACTester 
	    Create 3 object set their field value 
	    then call the methods */
	
	String brand;
	float currentTemp;
	boolean isOn;
	

	
	public void displayTheBrand(){
		System.out.println("the brand of AC: "+brand);
		
	}
	public void showCurrentTemp(){
		System.out.println("the temperature of the ac: "+currentTemp);
	}
	
	public void displayAllInfo() {
		System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
	}
	public void turnOn() {
		 System.out.println("current AC status: " + isOn);
		    
		    if(isOn == false) {
		      isOn = true ; 
		    }else {
		      System.out.println("It is already on !!!");
		    }
	}
	public void turnOff() {
		if(isOn) {isOn=false;
		System.out.println("it has been turned off");}
		else {System.out.println("it is already off");}
	}
	public float increaseTemp(float temp) {
		currentTemp+=temp;
		return currentTemp;
	}
	public void increaseTemp(int increaseBy) {
		currentTemp+=increaseBy;
		System.out.println("the temperatured increased to; "+currentTemp);
	}
	
	public void decreaseTemp(int decreaseBy) {
		currentTemp-=decreaseBy;
		System.out.println("the temperatured decreased to; "+currentTemp);
	}
	public void setTemperature(float targetTemp) {
		currentTemp=targetTemp;
	}
}
