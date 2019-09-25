package March31;

public class Separator {

	public static void main(String[] args) {
	
	String str = "Aonline132x";
	int i = 0;
	while (i<str.length()) {
		char c = str.charAt(i);
		if(c>='A'&& c<='Z')
		System.out.print("Uppercase in the word "+c+" ");
		i++;
	}
	
	
	
	}}