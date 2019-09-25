package May5;

import java.util.ArrayList;
import java.util.List;

public class ListWithMethds {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		lst.add("apple");
		lst.add("orange");
		lst.add("banana");
		lst.add("kiwi");
		
		printItems(lst);
		printItems(lst);
		
		System.out.println(getListFrom(7));
		System.out.println(getListFrom(17));
		System.out.println(getListFrom(3));
	}
	
	public static void printItems(List<String> strLst) {
		for(int i=0; i<strLst.size();i++) {
			System.out.print(strLst.get(i)+" - ");
		}
		System.out.println();
	}
	
	public static ArrayList<Integer> getListFrom(int x){
		
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<=x; i++) {
		numList.add(i);	
		}
		//System.out.println(numList);
		
		return numList;
	}

}
