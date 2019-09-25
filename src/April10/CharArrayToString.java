package April10;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		
String str1 = "Hayrulla Muattar";
char[] nameChars = str1.toCharArray();
System.out.println(Arrays.toString(nameChars));

String str2 = "";
for(int i=0; i<nameChars.length;i++) {
	char c = nameChars[i];
	//System.out.println(c+" ");
	//OR
	str2 = str2+c;
}
System.out.println(str2);
	}

}
