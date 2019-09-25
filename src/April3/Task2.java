package April3;

public class Task2 {

	public static void main(String[] args) {
		String str = "ABCDEBC";
		
//PRINT   AB BC CD DE EB BC
		//Count the number of BC on this string
		int count = 0;
		for(int i=0; i<str.length()-1;i++) {
			System.out.print(str.substring(i,i+2)+" ");
			if(str.substring(i,i+2).equals("BC")){
				count++;}
				}
		System.out.println();
		System.out.println("count of BC in string is: "+count);
		}

	}


