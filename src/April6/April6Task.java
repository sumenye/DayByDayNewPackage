package April6;

public class April6Task {

	public static void main(String[] args) {
		// NESTED LOOP WARMUP TASK
		//get unique character out of a String like aaabbbccc---->abc
		
String str = "aaabbccc";
String uniqueStr = "";
for (int i = 0; i<str.length(); i++) {
	String eachChar = str.substring(i,i+1);
	if(!uniqueStr.contains(eachChar)) { // ==-1 is also can be used 
	uniqueStr +=eachChar;
		System.out.println(eachChar);
}
	}
System.out.println(uniqueStr);
}
}
