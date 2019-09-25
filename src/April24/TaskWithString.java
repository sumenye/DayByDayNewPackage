package April24;

public class TaskWithString {

	public static void main(String[] args) {
		String sentence ="Love java";
	

		System.out.println(getMyString(sentence));


	}
	
	public static String getMyString(String sentence) {
		String firstChar = sentence.substring(0,1);
		String[] allWords = sentence.split(" ");
		String lastWord=allWords[allWords.length-1];
		String targetWord = firstChar + lastWord.substring(1);	
		return targetWord;
	}

}
