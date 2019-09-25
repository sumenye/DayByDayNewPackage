package April14;

import java.util.Arrays;

public class April14WarmUpTask {

	public static void main(String[] args) {
	
String str = "Sunday Perfect Day to start coding";
//
String [] strarr = str.split(" ");
String reversed = "";

for( int i= strarr.length-1;i>=0;i-- ) {
	reversed = reversed +strarr[i]+" ";
	
}
System.out.println(reversed.trim());

// ----------OR------------
//for( int i= strarr.length-1;i>=0;i-- ) {
//	System.out.println(strarr[i]+" ");
//	
//}	

String strRev = "" ; 
int lastIndex = strarr.length-1 ; 

for (int i = 0; i < strarr.length/2; i++) {
  //System.out.print(strArr[i] );
  String temp = strarr[i] ;
  strarr[i] = strarr[lastIndex - i] ; 
  strarr[lastIndex - i] = temp ;      
}
System.out.println(  Arrays.toString(strarr));


//----------------OR----------------
for(int i=0;i<strarr.length/2; i++) {
	System.out.println(strarr[i]);
	String temp = strarr[i];
	strarr[i]=strarr[lastIndex-i];
	strarr[lastIndex-i]=temp;
}
System.out.println(  Arrays.toString(strarr));
	
}




}
