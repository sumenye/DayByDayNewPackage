package March31;

public class DoWhileSum {

	public static void main(String[] args) {
		//TAS3:
		//USE WHILE LOOP TO GET THE SUM OF
		//1 TILL 10 (OPTIONALLY USE SCANNER TO GET 10)

		//OPTIONAL: IF THE SUM IS MORE THAN 40, BREAK OUT OF THE LOOP
		
int sum = 0;
		int x = 1;
		 do {
			 sum=sum+x;
			 System.out.println("x: "+x+" Sum equals: "+sum);
			 x++;
		 } while(x<=10);
		 System.out.println("Sum equals: "+sum);
		 
		 
		 //	OPTIONAL PART
		
		/*int sum = 0;
		int x = 1;
		 do {
			 sum=sum+x;
			 x++;
			if(sum>40) {break;}
		 } while(x<=10);
		 System.out.println("Sum equals: "+sum);
		  
		 */
		
	}

}
