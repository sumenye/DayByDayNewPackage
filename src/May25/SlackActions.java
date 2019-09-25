package May25;

public class SlackActions {

	public static void main(String[] args) {
		StudentUser s1 = new StudentUser("Sumeyye",6,"available",26);
		System.out.println(s1);
		s1.sendMessage("GO SPARTAN!!!");
		//s1.displayGroup ();
				
	}

}
