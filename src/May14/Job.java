package May14;

public class Job {
	
	private String title;
	private String company;
	private int annualSalary;
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setComapny(String company) {
		this.company=company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary=annualSalary;
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	
	public Job() {
	title="undefined";
	company="unknown";
	}
	
	public Job(String title) {
		this.title=title;
	}
	
	public Job(String title, String company,int annualSalary) {
		this.title=title;
		this.company=company;
		this.annualSalary=annualSalary;
	}
	
	 // this is the special method that will be called
	  // when reference variable printed out directly 
	  // and method header should exactly as below 
	  // toString , does not accept parameter and return String
	//  public String toString () {
//	        
//	    String allFields = "Title: " + this.title 
//	        + " | Company: " + this.company 
//	        + " | Annual Salary:" + this.annualSalary; 
	//    
//	    return allFields;
//	    }

	  public String toString() {
	    return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	  }

	
	  /*Job class
	  *
	  *   private fields 
	      title , company , annualSalary
	  *
	  *   Encapsulate above private instance fields
	  *   Create no arg constructor -- constructor with no parameter
	  *       to set title to “undefined”
	       to set company to “unknown”
	    
	    -- constructor with 1 parameter   
	  *   Create 1 arg constructor to set title  
	  *  -- constructor with 3 parameters   
	     Create 3 arg constructor to set all 3 fields
	  *
	  
	  *   create a method called toString
	  *   it accepts no parameters and
	  *   return concatenation of all field value in nice format
	  *
	    
	    Inside another class Called JobSeeking with main method 
	  
	  *   Create few job objects and and add it to ArrayList<Job> object
	  *   iterate over all items and print them out
	  *
	  * */
	
	
}
