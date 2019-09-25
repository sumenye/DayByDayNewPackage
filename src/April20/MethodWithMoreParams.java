package April20;



public class MethodWithMoreParams {

	public static void main(String[] args) {
		/*
		 * create a static method called login 
   * it return nothing
   * It takes 3 parameters : 
   *     user as String , password as String, 
   *     rememberMe as boolean
   * inside body 
   *     You entered username : ----
   *     You entered password : ----
   *     print you checked remeberMe checkbox if it's true 
   *     print you did not check remeberMe checkbox if it's false
		
		 * */ 

	login("sumsum","Password",true);
	login ("spartan","h300", false);
		
	}
	public static void login(String user,String password, boolean b) {
		System.out.println("You entered username : "+user);
		System.out.println("You entered password : "+password);
	
	if (b) {System.out.println("you checked remeberMe");}
	if (!b) {System.out.println("you did not check remeberMe");}
	}

}
