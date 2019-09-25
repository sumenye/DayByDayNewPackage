package June1;

public class FinalStaticField {
	
	//public static final field ---> CONSTANT
	public static final String RACE = "HUMAN";
	//public static final int MAX_SPEED;  ---> YOU CAN INITIALIZE IT A VALUE JUST IN STATIC BLOCK
	//ALL CAP IZ HIGHLY RECOMMENDED
	
	public static final int MAX_NUMBER = getStaticNum();
	

	public static final int MAX_SPEED;
	static {
		MAX_SPEED=120;	
	}

	
	
	public static int getStaticNum() {
		return 200;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(RACE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}

}
