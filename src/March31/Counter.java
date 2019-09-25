package March31;

public class Counter {

	public static void main(String[] args) {
	 //how many letter a showed up in this string
		String str = "jaaaaava";
		//LOGIC IS go through each and every character
		// if i see a, i will increment my counter by 1
		
		int countOfA = 0;
		int x = 0;
		do {
		char c = str.charAt(x);
		if(c=='a') {
			System.out.println("BINGO at "+x);
			countOfA++;
		}
		//System.out.println(str.charAt(x)+" ");
		x++;
		}while(x<str.length());
	 System.out.println("count of a: "+countOfA);
	}

}
