package June29;

import java.io.IOException;

public class MethodThatMightThrowCheckedException {

	 public static void main(String[] args) throws IOException {
		    
		    
//		    try {
			playWithFire();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
	  }
		  
		// handle or declare  
		  public static void playWithFire()  throws IOException{
		    
		    System.out.println("Playing with fire");
		    
		    //try {
		      throw new IOException();
		    //} catch (IOException e) {
		    //  System.out.println("CAUGHT EXCEPTION");
		    //} 
		    
		  }

		}

