package April7;

public class ArrayTas {

	public static void main(String[] args) {
		//  create an int array of 5 items and assign values ; 

		// double the value of 3rd item  : for example 9 --> 18 
		// update the value of 4th item to sum of 1st and 2nd items
		// print them out using the loop 
		
		int[] myarray = new int[5];
		myarray[0]=5;
		myarray[1]=15;
		myarray[2]=25;
		myarray[3]=35;
		myarray[4]=45;
		
		myarray[2]=2*myarray[2];
		myarray[3]=myarray[0]+myarray[1];
		
		for(int i=0; i<myarray.length;i++) {
			System.out.print(myarray[i]+" ");}
		
		// OPTIONALLY ------SWAP------- the value of first and last items 
		int tempValue= myarray[myarray.length-1];
		myarray[myarray.length-1]=myarray[0];
		myarray[0]=tempValue;
		System.out.println();
		
		for(int i=0; i<myarray.length;i++) {
			System.out.print(myarray[i]+" ");}
		}
		
	}

