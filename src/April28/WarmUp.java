package April28;

public class WarmUp {

	public static void main(String[] args) {
		// create a static method called findLongestWord
		//it will have one paraeneter as String vararg
		//return the longest word passed 
		
		System.out.println(findLongestWord("Sumeyye","Hafsa","Emre", "Okan","Omer"));	

	}
	public static String findLongestWord(String... varArg) {
		String longest = varArg[0];
		
//		for(int i=0; i<varArg.length;i++) {
//			if(varArg[i].length()>longest.length()) {
//				longest=varArg[i];
//			}	
//		}
		
		for(String each : varArg) {
			if (each.length()>longest.length()) {
				longest = each;
			}
			
		}
	
		return longest;
	}

}
