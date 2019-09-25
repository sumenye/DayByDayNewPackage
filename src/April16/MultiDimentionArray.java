package April16;

import java.util.Arrays;

public class MultiDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String [][] pizza1 = new String[7][3];
		
		String[][] pizza = { { "Mushroom", "Black Olive", "Green Pepper" }, { "Spinach", "Green Pepper", "Mushroom" },
				{ "Black Olive", "Black Olive", "Spinach" }, { "Mushroom", "Mushroom", "Red Pepper" },
				{ "Banana Pepper", "Spinach", "Red Pepper" }, { "Mushroom", "Green Pepper", "Green Pepper" },
				{ "Spinach", "Green Pepper", "Mushroom" } };
	
		//System.out.println(Arrays.deepToString(pizza));
//		for(int i=0; i<pizza.length;i++) {
//			for(int j=0;j<pizza[i].length; j++) {
//				System.out.print(pizza[i][j]+" ");	
//			}
//			System.out.println();
//		}
		for(String[] slice :pizza) {
			for ( String topping :slice) {
				System.out.print(topping+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		//SKIP 3RD SLICE OF PIZZA
		spartan:
		for(int i=0; i<pizza.length;i++) {
			System.out.println("Slice number: "+(i+1));
			for(int j=0;j<pizza[i].length; j++) {
				if(pizza[i][j].contentEquals("banana pepper")) {
					break spartan;
				}
				System.out.print(pizza[i][j]+" | ");
			}
			System.out.println();
				
			}
	}

}
