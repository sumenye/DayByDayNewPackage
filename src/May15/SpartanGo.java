package May15;

public class SpartanGo {

	public static void main(String[] args) {
		
Spartan s1 = new Spartan();
System.out.println(s1);


String[] certs = {"OCA", "PSM", "AWS", "OCP"};
Spartan s2 = new Spartan("Coder",8, 600, false, certs);
System.out.println(s2);
Spartan s3 = new Spartan("Coder1",18, 700, false, new String[] {"OCA"});
Spartan s4 = new Spartan("Coder2",12, 200, false, new String[] {});
Spartan s5 = new Spartan("Coder3",3, 100, true, null);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);

	}

}
