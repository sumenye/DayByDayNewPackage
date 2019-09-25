package May8;

public class Student {

	//access modifiers
	/*
	 * public/protected/default/private
	 * we can use it for any methods,
	 * we can use it for fields
	 * */
//	public String name;
//	public int age;
//	public long ssn;
	public String name;
	public int age;
	public long ssn;
	
	public void displayName() {
		System.out.println("name is: "+name);
	}
	
	private void displayNameAndAge() {
		System.out.println("name is: "+name+"age is:"+age);
	}
	private void showSSN() {
		System.out.println("SSN is:"+ssn);
	}
}
