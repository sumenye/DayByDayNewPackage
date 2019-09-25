package March24;

public class ReplacePartOfString {

	public static void main(String[] args) {
		
String str = "Date is 03_25_2019";
str = str.replace('_','-');
System.out.println(str);

str = str.replace("is","will be");
System.out.println(str);

// Date will be 03-25-2019  --->>>03-25-2019
System.out.println(  str.replace("Date will be ", "")    );		
	}

}
