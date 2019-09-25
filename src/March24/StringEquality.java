package March24;

public class StringEquality {

	public static void main(String[] args) {
	
String s1 = "abc"; //using string literAL
String s2 = new String("abc"); ///using new keyword

//IN ORDER TO USE EFFICIENTLY THE heap MEMORY YOU SHOULD USE STRING POOOL
String s3 = s1;
System.out.println(s1==s3);//true --> bec it is literal
System.out.println(s1==s2);//false -->bec it is not literal


//SCP == STRING CONSTANT POOL --->> STRING POOL

//What is String pool:
	//String pool is a special location inside heap
	//to store unique string literal

	}

}
