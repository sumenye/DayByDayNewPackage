package May8;

import May7.BankAccount;

public class StudentTester {

	public static void main(String[] args) {
	
Student muammar = new Student();


muammar.name="Muammer";
muammar.age = 27;
muammar.ssn = 1234567;
muammar.displayName();
//muammar.displayNameAndAge();
//muammar.showSSN();

//bank account is in diff package
BankAccount acc1 = new BankAccount();
//if instance field is public it compiles 
System.out.println(acc1.balance);
//but if i make it private or default it wont compile
//System.out.println(acc1.accountHolder);
//same for instance methods
//acc1.add100Dollar();---=>wont compile because default is nnot accessable
	}

}
