package April7;

public class WarmUpTask {

	public static void main(String[] args) {
	     /*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         * 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
//         *     ALL THE WAY TILL Z**/
//		for (int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=5;j++) {
//				System.out.print("java ");	
//			}
//			System.out.println();
//		}
//		//task 2-----------------------------
//		
//for (int x=1;x<=5;x++) {
//			
//			for(int a=1;a<=x;a++) {
//				System.out.print(a+" ");	
//			}
//			System.out.println();
//		}
//
////---------------task 3---------------------


for (int x='A';x<='Z';x++) {
	
	for(int c='A';c<=x;c++) {
		System.out.print((char)c+" ");	
	}
	System.out.println();
}

	}

}
