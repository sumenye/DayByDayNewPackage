package April6;

public class RowsColumnsNestedLoop {

	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			  //System.out.println("Row : " + row);
			  for (int column = 1; column <= 4; column++) {

			    System.out.print("Cell (" + row+","+column + ") ");

			  }
			  System.out.println();
			}
	
	}

}
