package April2;

public class LoopControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int count2 = 0;
int toplam =0;
		//TASK2
		for(int i=1;i<50;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");}
			if(i%4==0) {
				count++;}
			}
		System.out.println();
		System.out.println("count of numbers divisible by 4 is:"+count);
		
		for(int i=0;i<50;i++) {
			if(i%15==0) {continue;}

			toplam = toplam+i;}
		System.out.println(toplam);	
		}
	}


