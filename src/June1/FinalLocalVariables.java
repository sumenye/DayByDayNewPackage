package June1;

public class FinalLocalVariables {

	public static void main(String[] args) {
		
		//cannot reassing a value for final variable
		//A primitive type store value directly 
		//so final variable can noit have a new value here
		final int x = 10;
		//x = 12;
		
		
		//a reference variable store address of the object 
		//once it is pointed to the object it cannot point to 
		//different object
		final Building b1 = new Building(100);
		b1.num=200;
		System.out.println(b1.num);
		//HOT INTERVIEW QUESTION
		//address is written with permanent marker
		//IF YOU WANT TO CHANGE THE POINTER OF b1
		//b1=new Building(300);----> will NOT COMPILE
		
	}

}
class Building{
	int num;
	public Building(int num){
		this.num=num;
	}
}