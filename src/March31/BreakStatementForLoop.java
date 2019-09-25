package March31;

public class BreakStatementForLoop {

	public static void main(String[] args) {
		
/*for (int i=0;i<10;i++) {
	System.out.println(i);
	if(i==5) {
		break;
	}
}*/
		
		String name = "Muhammed Hayrulla Cisem";
		int count = name.length();
		for (int i=0; i<count; i++) {
			System.out.print(name.charAt(i)+" ");
		}
		System.out.println();
	//	-----------------------------------------------
		for (int i=count-1; i>0; i--) {
			System.out.print(name.charAt(i)+" ");}
		
	}

}
