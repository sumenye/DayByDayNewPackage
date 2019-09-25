package May18;

import java.util.ArrayList;
import java.util.List;

public class SlackAction {

	public static void main(String[] args) {
		SlackUser s1 = new SlackUser("Sumeyye","sumsum@gmail.com",26);
		SlackUser s2 = new SlackUser("Deniz","deniz@yahoo.com",15);
		SlackUser s3 = new SlackUser("Betul","betul@gmail.com",3);
		SlackUser s4 = new SlackUser("Oznur","oznur@gmail.com",9);
		
		System.out.println(s1.getEmail());
		
		ArrayList<SlackUser> lst = new ArrayList<>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
	    for(SlackUser each: lst) {
	        System.out.println(each);
	        each.sendMessage("general", "Good morning!" );
	        }
	}
/**
 * create a ArrayList of SlackUser add all the objetcs 
		loop through each item and print out 
		and call sendMessage on each of them 
 * 
 * */
}
