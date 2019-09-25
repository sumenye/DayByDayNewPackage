package May1;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList<Double> priceList = new ArrayList<>();
		priceList.add(10.5);
		priceList.add(17.3);
		priceList.add(6.5);
		priceList.add(9.7);
		priceList.add(13.2);
		
		System.out.println("Third item is: "+priceList.get(2));
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println( priceList.get(i)   );
		}
		
	System.out.println("---------");
		
		for(Double each : priceList) {
			System.out.println( each  );
		}
		
		System.out.println("---------");	
		for (int i = 0; i < 5 ; i++) {
			if(priceList.get(i)>10.0) {
			System.out.println( priceList.get(i)   );
		}}
		
	
		double sum = 0;
		for(double eachItem : priceList) {
			sum+=eachItem;
		}
		System.out.println("sum of the arralist: "+sum);
	 
	}

}
