package April23;

public class ReturnTypeMethod {

	public static void main(String[] args) {
		
String name = "Emine";
System.out.println(name.charAt(1));
System.out.println(name.length());
//char c = name.charAt(1);
//System.out.println(c);
giveMe5();
System.out.println(   giveMe5()    );
System.out.println(  ReturnTypeMethod.giveMe5()    );

	}
		
	public static int giveMe5() {
		return 5;
	}

}
