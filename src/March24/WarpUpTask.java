package March24;

public class WarpUpTask {

	public static void main(String[] args) {
		
String str = "Sunday is Java Day";
String str1 = str.toUpperCase();
System.out.println(str1);
int last = str.length()-1;
System.out.println(str.charAt(last-1)+""+str.charAt(last));
System.out.println(str.indexOf("is"));
boolean java = str.contains("Java");
System.out.println(java);

//OPTIONAL
int indexOfFirstSpace = str.indexOf(" ");
String secondWord = str.substring(indexOfFirstSpace+1, 
		indexOfFirstSpace+3); 

String kendicumlem = "Bu da sakin sana ders olsun!";

System.out.println(kendicumlem.indexOf("sa", 6));

	}

}
