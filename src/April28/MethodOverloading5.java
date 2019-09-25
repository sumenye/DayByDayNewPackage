package April28;

public class MethodOverloading5 {

	public static void main(String[] args) {
	    // ANY literal non-fractional numbers will be seen as int 
	    // ANY literal fractional numbers will be seen as double 
		
//		double d;
//		d=10;
//		System.out.println(d);
//		d=10L;
//		System.out.println(d);
//		d=10f;
//		System.out.println(d);
		release((short)10);
		release((byte)10);
		release(10);
		release(10L);
		release(10F);
		//release(10d);//does not compile , double 
		//release(10.5);//does not compile
		release(15/2);
		//release(15/2.0); //does not compile
		release(15/2.0f);
		
	}
	public static void release(float f) {
		System.out.println("float "+ f);
		
	}
//	public static void release(double d) {
//		System.out.println("double "+ d);
//		
//	}
	public static void release(int d) {
		System.out.println("int "+ d);
		
	}
	


}
