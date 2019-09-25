package March27;

public class GiveMeSum {

	public static void main(String[] args) {
	//INTERVIEW QUESTION: HOW DO YOU GET THE SUM OF NUMBER
		//STARTING FROM ONE TILL DESIGNED NUMBER
		//USER INPUT 5 ----> 1+2+3+4+5=15
		// sum will be 0 in the beginning
		int sum = 0;
		int count = 1;
		while (count<=20) {
			sum = sum + count;
			System.out.println("current sum: "+sum+" count is: "+count);
			count++;
		}
		System.out.println(sum);
	}

}
