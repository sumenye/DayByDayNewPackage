package March24;

public class AnotherIndexOf {

	public static void main(String[] args) {
		    //01234567890123456789
		
		
String str = "Ahmad Omar Al Alousi";
System.out.println(str.indexOf("A")  );
System.out.println(str.indexOf("A",11)  );
//give me part of string from loation 6 till location 10
System.out.println(str.indexOf("A",10)  );

System.out.println(str.indexOf("A",1)  );
System.out.println(str.indexOf("A",12)  );
int firstSpace = str.indexOf(" ");
int secondSpace = str.indexOf(" ",firstSpace+1);
String secondWord = str.substring(firstSpace+1, secondSpace);
System.out.println(secondWord);
	}

}
