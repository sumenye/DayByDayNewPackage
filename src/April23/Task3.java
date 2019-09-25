package April23;

public class Task3 {

	public static void main(String[] args) {
		
	int biggerNum = giveMeBigger(10,12);
	System.out.println(biggerNum);
	//----------OR-------------
	System.out.println(giveMeBigger(100,120));
	}
	
		public static int giveMeBigger(int num, int num1) {
			
		int max = (num>num1)?num:num1;	
		return max;
		
	}

}
