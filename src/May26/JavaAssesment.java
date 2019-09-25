package May26;

public class JavaAssesment extends Assesment{
	
	int level;
//	int questionCount; ---->already inherited
//	int score;
//	String type;
//	static int timeLimit = 45;
	
	public static void main(String[] args) {
	
	//static way to access timeLimit
	System.out.println( Assesment.timeLimit );
	
	//accessing inherited static field in static method
	System.out.println( timeLimit );
	
	timeLimit = 50;
	
	//accessing inherited static field in static way using this class name	
	System.out.println( JavaAssesment.timeLimit );
	
	
    Assesment.printTimeLimit();
    printTimeLimit();
    JavaAssesment.printTimeLimit();
	
	
	}

}
