package May19;
import static May19.StudentUtility.displayAllStudent ; 
import static May19.StudentUtility.* ; 

public class StudentActivity {

	public static void main(String[] args) {
		// import is used to import the type that not under the package 

		// static import 
		  //-->> is used to import the visible static members of another class 
		  // we use keyword import static yourClasname.staticMember; 
		  // just like importing the class, we can use .* to import all static members

		    //StudentsUtility.displayAllStudent();
		    displayAllStudent();
		    System.out.println("---------------");
		    addOneStudent("Tugba");
		    addOneStudent("Sheroz");
		    displayAllStudent();
		    
		    System.out.println("---------------");
		    updateStudent(11, "Sheroz Zoidov");
		    displayAllStudent();
		    
		    System.out.println("---------------");
		    removeStudent(6);
		    displayAllStudent();
		    
		    System.out.println("---------------");
		    resetTheList();
		    displayAllStudent();

		    
		    
	}

}
