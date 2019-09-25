package May26;

public class Assesment {

	int questionCount;
	int score;
	String type;
	
	//in our application all assesment has one shared timeLimit
	static int timeLimit = 45;
	
	//static method can access only static members
	public static void printTimeLimit() {
		System.out.println("time limit "+timeLimit);
	}
	
	
	
	@Override
	public String toString() {
		return "Assesment [questionCount=" + questionCount + ", score=" + score + ", type=" + type + "]";
	}
	
	

}
