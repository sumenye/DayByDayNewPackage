package April9;

public class CanvasPractice {

	public static void main(String[] args) {
	
	    String[] courses = {
		        "Welcome Kit",
		        "Online-Java Programming",
		          "Online-Software Development Lifecycle",
		          "Online-Software QA Testing",
		          "Online-Team Activity",
		          "Online-Mentoring", 
		          "Online-Selenium",
		          "Online-SQL",
		          "Online-API Testing"
		        } ;
		  int[] courseId = {143,166,168,170,163,203,169,171,164} ;   
		  
		  // use above two array to generate below messages 
		  // The course id for <Welcome Kit> is <143>  
		  
		//  for(int i=0; i<courses.length;i++)
//		    System.out.println(" The course id for <"+courses[i]+"> is <"+courseId[i]+">");
		//  
		  // find out the ID of online Java Programming course 
		  
		  for(int i=0; i<courses.length;i++) {
		    
		    String eachCourse = courses[i] ; 
		    //System.out.println(eachCourse);
		    if(eachCourse.equals("Online-Java Programming")) {
		      System.out.println("INDEX IS " +  courseId[i]  );
		      break; 
		    }
		  }
		  
		  // find out the course name of 203 
		  
		  // count the courses that contains Software 
		  
		  // 
		  
		//  for(int i=0;i<9;i++)
//		     {
//		      System.out.println("<"+courses[i]+"> is <"+courseId[i]+">");
//		     }
		  
		  // count the courses that contains Software 
		  int count = 0 ; 
		  for (int i = 0; i < courses.length; i++) {
		    
		    if(courses[i].contains("Software")) {
		      count++ ; 
		    }
		    
		  }
		  System.out.println("Course that contains Software : " + count);
		  }

		}