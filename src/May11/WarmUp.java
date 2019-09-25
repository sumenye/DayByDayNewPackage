package May11;

import java.util.ArrayList;
import java.util.Random;

public class WarmUp {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
//		lst.add(1);
//		lst.add(3);
//		lst.add(5);
//		lst.add(7);
		
		
		for(int i=1;i<8;i+=2) {
			lst.add(i);
		}
		System.out.println(lst);
		for(int i=0;i<lst.size();i++) {
			//lst.set(i,(i+1)*2);
			lst.set(i,lst.get(i)*2);
		}
		System.out.println(lst);
		
		ArrayList<Integer> reversedlst = new ArrayList<>();
		for(int i=lst.size()-1;i>=0;i--) {
			reversedlst.add(lst.get(i));
		}
		System.out.println(reversedlst);
		
//		Random r = new Random();
//		ArrayList<Integer> randomlst = new ArrayList<>();
//		for(int i=0;i<lst.size();i++) {
//			randomlst.get(r.nextInt(lst.size()));
//		}
//		System.out.println(randomlst);
		ArrayList<Integer> nums=new ArrayList<>();
		Random ran=new Random();
		for(int i=0; i<5; i++)
			nums.add(ran.nextInt());		
		System.out.println(nums);
	}

}
