package May18;

import java.util.ArrayList;

public class SlackActionA {


	  public static void main(String[] args) {
	    
	    SlackUserA s1 = new SlackUserA(); 
	    System.out.println( s1.toString() );
	    // below code will be seen as above code for compiler
	    System.out.println( s1 );
	    
	    SlackUserA s = new SlackUserA ("magician", "akbar@cybertek.com", 0);
	    SlackUserA s2 = new SlackUserA ("instructor", "instructor@cybertek.com", 0);
	    SlackUserA s3 = new SlackUserA ("student", "student@cybertek.com", 29);
	    SlackUserA s4 = new SlackUserA ("mentor", "mentor@cybertek.com", 20);
	    
	    ArrayList <SlackUserA> userList = new ArrayList <>();
	    userList.add(s1);
	    userList.add(s2);
	    userList.add(s3);
	    userList.add(s4);
	    
	    for (SlackUserA each : userList) {
	      System.out.println(each);
	      each.sendMessage("general", "Good morning!" );
	    }
	    
	    

	  }

	}