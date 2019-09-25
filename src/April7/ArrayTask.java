package April7;

public class ArrayTask {

	public static void main(String[] args) {
//	String name = "Sumeyye";
//	char[] letterOfName= {'S', 'u', 'm', 'e', 'y', 'y', 'e'};
		
		//-----------OR-----------------
		char[] nameChar = new char[7];
		nameChar[0]= 'S';
		nameChar[1]= 'u';
		nameChar[2]= 'm';
		nameChar[3]= 'e';
		nameChar[4]= 'y';
		nameChar[5]= 'y';
		nameChar[6]= 'e';
	///	nameChar[7]= 'C';----- this will be exePtion, because
		// our array index is assigned as 6.
		for(int i=0; i<7; i++) {
			System.out.print(nameChar[i]);	
		}
		System.out.println();
		
		//--------
		char[] name2 = new char[] {'G', 'u', 'l', 'j', 'a', 'h', 'a', 'n'};
		for(int i=0; i<=name2.length-1;i++) {
		System.out.print(name2[i]+" ");	
		}
	//--------------
		char[] name3 = {'B', 'e', 'n', 'j', 'a', 'm', 'i', 'n'};
	     /// how do we get last items 
	     int count = name3.length ; 
	     System.out.println();
	     
	     System.out.println( "item in last index : " +  name3[count-1] );
	     // how do we get the one in the middle 
	     
	     int midIndex = count/2 ; 
	     
	     System.out.println( "item in mid index : " +  name3[midIndex] );
	}

}
