package March26;

public class WarmUpTask {

	public static void main(String[] args) {
		
/*String a = "abc"; //----> in the pool
String b = a.concat("efg"); //-----> in the heap
String c = "abcefg"; //----> in the pool
System.out.println(b==c);*/
		
		/*int y = 5;
		while(y>1) {
		System.out.println("Hello" +y);
		--y;
		}*/
		
		
		int x= 0;
		//while(x<=10) {   //------>we have 6 iterations here, so faster
			
			//System.out.println("even numbers :"+x);
			//x+=2;
		while(x<11) {
			if(x%2==0) {  //-------> we have 11 iterations here, slower
				System.out.println("even numbers :"+x);	
			}
				x++;
			
		}
		
	}

}
