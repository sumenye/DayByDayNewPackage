package May19;

public class OCArray {

	public static void main(String[] args) {
		
String[] a = new String[] {"a","b","c"};
String[] b = new String[] {"d","e"};

for(int i=0, j=0; i<a.length || j<b.length; i++,j++) {
System.out.print(a[i]+" "+b[j]+"-");	
}

	}

}
