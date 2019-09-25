package April20;

public class Calculator {

	public static void main(String[] args) {
		
int[] arrObject = {1,2,5,6};
		arrayPrinterWithDash(arrObject);

	}
	public static void arrayPrinterWithDash(int[] manyItems) {
		
		for(int each:manyItems) {
			System.out.print(each+"-");	
			}
		System.out.println();
	}

}
