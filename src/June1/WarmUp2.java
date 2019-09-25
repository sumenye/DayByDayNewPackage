package June1;

import java.util.Random;

public class WarmUp2 {
	
	//How an we initialize fields values?
	/*
	 * if no action is taken, default value will be provided
	 * we can directly assign value with value
	         or we can call a method
	 * it can be initialized in initializer block
	 * it can be initialized in constructor
	 * */
	
	int num = getANumber();
	
	public static void main(String[] args) {
		WarmUp2 w = new WarmUp2();
		System.out.println(w.num);
	}
	
	public int getANumber() {

	Random r = new Random();
	int number = r. nextInt(100);
	return number;
	}
	

}
