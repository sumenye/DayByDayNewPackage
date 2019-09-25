package April6;

public class PrintA_Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char a = 'a';
System.out.println(a+1); // it is using the ascii number
char next = (char)(a+1); 
//using (char) we declared that I will use it as a character
System.out.println(next);

//*******************       UPCASTING      ********
	int asciiCode = 'a';
	System.out.println(asciiCode);
	
		for(int i = 'a'; i<='z' ; i++) {
			System.out.print(i+" "); // this will give us number so
			char eachChar = (char)i; // ****  downcasting ***** the int to char
			System.out.println();
			System.out.print(eachChar+" ");
		}
	}

}
