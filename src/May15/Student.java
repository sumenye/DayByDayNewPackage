package May15;

public class Student {

	String name;
	int age;
	String major;
	String gender;
	int studyHour;
	boolean tired;

	 // one constructor can be called 
	  // in another constructor of same class
	  // this(arguments)
	  
	  // However , 
	  // THIS CAN BE ONLY A SINGLE CALL 
	  // this(arguments) can not be called more than once 
	  
	  // this(args..) 
	    // call MUST BE first line of your constructor
	  
	public Student(boolean tired) {
		this("name", 33, "major","gender",8);

	}
	
	public Student(String name, int age, String major, String gender,int studyHour) {
		
	}
	  
	  public Student() {
	    
	    //System.out.println("asdasdsadsa");
	    // calling constructor with 1 argument 
	    // to put default name 
	    this("NO NAME"); 
	    //this("NO NAME"); 
	    System.out.println("no arg");
	    
	  }
	  
	  public Student(String name) {
	    
	    System.out.println("1 arg " + name);
	  }


	  public Student(String name, int age, String major) {
	    
	    this() ; 
	    //this("my name");
	    System.out.println("3 arg");
//	    this.name = name;
//	    this.age = age;
//	    this.major = major;
	    //this() ;     
	  }
	  
	  

}
