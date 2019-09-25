package June1;

public class Computer extends Electronic{
	
	//Can a overriden method be final?---> INTERVIEW QUESTION
	
	
//@Override  this is a new method , it is not overriding
//	public void turnOn() {
//		System.out.println("computer");
//	}
	
	public final void turnOff() {
		System.out.println("COMPUTER OFF");
	}

}

class Electronic{
	
//	private void turnOn() {
//		System.out.println("electronic");
//	}
	public void turnOff() {
		System.out.println("Electronics OFF");
	}	
	
}
//as long as it is not final i can override it
//but you can make the method in sub class final
//because you don't need to override it
