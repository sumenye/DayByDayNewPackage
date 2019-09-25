package May15;

import java.util.Arrays;

public class Spartan {

	  String name; 
	  int studyHour; 
	  int horsePower; 
	  boolean tired; 
	  String[] certificates; 
	  
	  // this no arg constructor should set default value for name, studyHour , horsePower
	  public Spartan() {
		  this("No Name", 5);
	    System.out.println("no arg");
//	    this.name = "No Name";
//	    this.studyHour = 5; 
	    this.horsePower = 320; 
	  }
	  
	  
	  public Spartan(String name, int studyHour) {
	    this.name = name; 
	    this.studyHour = studyHour; 
	  }
	  
	  public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {
	    this.name = name;
	    this.studyHour = studyHour;
	    this.horsePower = horsePower;
	    this.tired = tired;
	    this.certificates = certificates;
	  }


	  
	  public String toString() {
	    return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
	        + ", certificates=" + Arrays.toString(certificates) + "]";
	  }
	  
	  
	  
}
