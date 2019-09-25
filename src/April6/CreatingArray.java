package April6;

public class CreatingArray {

	public static void main(String[] args) {
		
		//once array is created with a given size
		//it cannot be changed
		int[] numbers = new int[2];
		//AASIGNING VALUE TO ARRAY
		
		numbers[0] = 10;
		numbers[1] = 15;
		//ArrayIndexOutOfBoundsException will occur 
		//when you go out of range
		//numbers[2] = 28;
		//numbers[3] = 35;
		numbers[0] = 100; //last assigned value will be used....
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
	}

}
