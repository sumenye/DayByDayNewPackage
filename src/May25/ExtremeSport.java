package May25;

public class ExtremeSport extends Sport {
	//same method name, same parameter, same return type, same access modifier---->OVERRIDING
	//@Override---> this is the optional annotation to make sure you have 
	//overriden the method correctly
	public void doSport() {
		System.out.println("doing extreme sport --- sky diving");
	}

	public static void main(String[] args) {
		ExtremeSport e1 = new ExtremeSport();
		e1.doSport();
	}

}
