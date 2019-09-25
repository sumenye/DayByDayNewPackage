package March24;

import java.util.Scanner;

public class EndsWithTask {

	public static void main(String[] args) {
	
System.out.println("Enter a name: ");
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
boolean endAndStart = name.endsWith("x") && name.startsWith("A");
if (endAndStart)
	System.out.println("The name starts with A and ends with x");
else
	System.out.println("The name does not starts with A and ends with x");

//int last = name.length()-1;
//int positionOfLasta = name.substring(beginIndex)

System.out.println("the position of last a :"+ name.lastIndexOf("a"));
//optional
if (name.length()>2) {
int middle = name.length()/2;
if(name.length()%2==0)
	System.out.println("middle letters are: "+name.charAt(middle-1)+""+name.charAt(middle));	
else if (name.length()%2!=0)
System.out.println("middle letter is: "+name.charAt(middle));
}


	}

}
