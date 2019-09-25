package April17;

public class MethodWithParameter {

	public static void main(String[] args) {
		printTheSum(10.5,20.9);
		printTheSum(123.9,200.1);
		printTheSum(11.33,44.1);
		//String s="abc";
		//System.out.println(s.substring(1,3));
	}
	public static void printTheSum(double a,double b) {
		double sum=a+b;
		System.out.println("sum of numbers is: "+sum);
	}

}
