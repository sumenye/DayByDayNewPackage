package March24;

public class StringTrimming {

	public static void main(String[] args) {
	
String str = "   GOO JAVA SPARTAN   ";
System.out.println(str);
System.out.println(str.trim());
//PRINT THE CHARS AFTER GOO
int indexO = str.lastIndexOf("O");
System.out.println(str.substring(indexO+1).trim());

//System.out.println(str.substring(str.indexOf(“J”), str.indexOf(“N”)+1));


	}

}
