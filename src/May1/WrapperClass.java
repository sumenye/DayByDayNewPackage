package May1;

public class WrapperClass {

	public static void main(String[] args) {
		
Byte b = new Byte((byte)123);
//printByteValue(10); //does not compile
printByteValue((byte)10);

byte b1 = 12;
printByteValue(b1);
	}
	
public static void printByteValue(byte b) {
	System.out.println(b);
}
}
