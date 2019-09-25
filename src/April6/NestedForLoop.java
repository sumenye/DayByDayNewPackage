package April6;

public class NestedForLoop {

	public static void main(String[] args) {
	/*for(int j=0; j<3; j++) {
			for(int i =1;i<6;i++) {
				System.out.print(i+" ");}
			System.out.println();
			}*/
		
		//repeating some part of the code with nested loop
		for(int j=1;j<=5;j++) {
			System.out.println("iteration number"+j);
			for(int i=15;i>=5;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		}
	}


