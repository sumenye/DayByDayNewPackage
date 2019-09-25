package June15;

import java.util.ArrayList;

public abstract class Electronic {
	public abstract void turnOn();
	
	public static void main(String[] args) {
		
		
		ArrayList<Electronic> lst = new ArrayList<>();
		
		lst.add(new Computer());
		lst.add(new AirConditioner());
		lst.add(new Computer());
		lst.add(new AirConditioner());
		lst.add(new Computer());
		lst.add(new AirConditioner());
		lst.add(new AirConditioner());
		lst.add(new AirConditioner());
		lst.add(new Computer());
		lst.add(new AirConditioner());
		
		int comcount=0;
		int account=0;
		
	
		
		for(int i=0; i<lst.size();i++) {
			if(lst.get(i) instanceof Computer)
			comcount++;	
			else if (lst.get(i) instanceof AirConditioner)
				account++;
		}
		System.out.println("AC count is "+account);
		System.out.println("Computer count is "+comcount);
		
		System.out.println("=========================");
		for(Electronic each : lst) {
			if(each instanceof Computer) {
				Computer cp = (Computer)each;
				cp.code();}
			else if(each instanceof AirConditioner) {
				AirConditioner ac = (AirConditioner)each;
				ac.controlTemp();}
		}
	}

}

//Add 1 functionality to each sub classes 
// add a void method with no return type for each sub classes 
//    Computer -->>> code()   -->> print coding 
//    AirConditioner --- >>> controlTemp()  -->> print controlling temp 
  
// try to call them while looping through above list of Electronic


class Computer extends Electronic{
	
	public void turnOn() {
		System.out.println("Turning on computer");
	}
	
	public void code() {
		turnOn();
		System.out.println("coding");
	}
}
class AirConditioner extends Electronic{
	
	public void turnOn() {
		System.out.println("Turning on AirConditioner");
	}
	
	public void controlTemp() {
		turnOn();
		System.out.println("controlling temperature");
	}
	
}
