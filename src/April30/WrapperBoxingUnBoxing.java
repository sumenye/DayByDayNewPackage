package April30;

public class WrapperBoxingUnBoxing {

	public static void main(String[] args) {
		
Integer i1 = new Integer(12);
Integer i2 =12; //int 12 is auto-boxed to Integer i2
int i3 = i1; //Integer i1 is auto-unboxed to int 12;

Double d1 = 3.14; //double 3.14 is auto-boxed d1
double d2 = new Double(12.5); //Double 12.5 is auto-unboxed to double
double d3 = d1; //d1 with reference type Double auto-unboxed to double

	}

}
