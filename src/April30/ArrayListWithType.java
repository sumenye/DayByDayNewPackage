package April30;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {
		
		// NO PRIMITIVE TYPES ALLOWED AS TYPE
		//ArrayList<int> numList ; ---> we have to use wrapper class
		
		ArrayList<Integer> numList = new ArrayList<>();
		//numList.add("ABC");---->DOESNOT COMPILE, STORES ONLY INTEGER HERE
		
		
		Integer i = 100; //auto-boxing to Integer Object
		
		//ADDING ITEM
		//WE call add method from ArrayList class
		numList.add(i);
		numList.add(200);
		numList.add(300);
		
		System.out.println(numList);
		
		//GETTING SINGLE ITEM FROM ARRAYLIST
		//we call get(index) of ArrayList
		
		Integer i1 = numList.get(0);
		int i2 = numList.get(1); //auto-unboxing Integer to int i2
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(numList.get(2));
		
	}

}
