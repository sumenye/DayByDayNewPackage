package May5;

public class RunnerClass {

	public static void main(String[] args) {
		// local variable
		//String s = "abc";
		//creating new person object
		Person p1 = new Person();// we created a person object
		//setting attributes value of object
		p1.name = "Talmurat";
		p1.age = 1;
		p1.gender = 'M';
		
		String name = "Jon Snow";
		int age =33;
		char gender = 'M';
		
		Person p2 = new Person();
		p1.name = "Diana";
		p1.age = 27;
		p1.gender = 'F';
		
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
	}

}
