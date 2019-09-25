package April30;

public class WrapperClass {

	public static void main(String[] args) {
		int i=10;
		//boolean, char, byte, short, int, long, float, double
		
		//WRAPPER CLASS---->
		//specifically designed to store primitive value as object
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("false");
		Boolean b2 = Boolean.valueOf(true);
		Boolean b3 = Boolean.valueOf("true");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");
		Integer i3 = Integer.valueOf(123);
		Integer i4 = Integer.valueOf("123");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println("equals? " + i1.equals(123));
		
		Character c1 = new Character('c');
		Character c2 = Character.valueOf('c');
		
		System.out.println(c1);
		System.out.println(c2.toString());
	}

}
