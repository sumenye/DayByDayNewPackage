package April24;

public class ReturnStringArrayConcat {

	public static void main(String[] args) {
		
String [] names = {"Emine","Firdevs","Sharif","Bahadir","Mehmet"};
String concatResult = addAll(names) ; 

System.out.println(concatResult);

	}
	public static String addAll(String[] strs) {
    String concatenation = "";
    for (int i = 0; i < strs.length; i++) {
        concatenation += strs[i];
    }
    return concatenation; 
}
}
