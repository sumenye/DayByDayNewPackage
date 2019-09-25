package April17;

public class Task {

	public static void main(String[] args) {
		reportName("Sumeyye", "Cetinas");
		reportName("Aliia", "Fizulina");
		reportName("Jon", "Snow");
		reverseString();
	}
	public static void reportName(String s1, String s2) {
		System.out.println("firstname is: "+s1+", last name is: "+s2);
		System.out.println("length of first name is: "+s1.length()+", last name is: "+s2.length());
		System.out.println("initials of your name: "+s1.substring(0,1)+s2.substring(0,1));
	}
	public static void reverseString() {
		
		String s1= "Sumeyye";
		String s2="Cetintas";
		for(int i=s1.length()-1; i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		for(int i=s2.length()-1; i>=0;i--) {
			System.out.print(s2.charAt(i));
		}
	}
	

}
