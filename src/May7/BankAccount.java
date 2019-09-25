

package May7;
import java.util.Scanner;
import java.util.Scanner;

public class BankAccount {
	
	//2 instance variable/fields
	private String accountHolder;
	public double balance;
	
	//create an instance method (non-static method)
	//called showAccountHolder---> printOut Account Holder Name
	
	//OPTIONAL
	//create an instance method showBalance and print out the balance
	//create an instance method called add100Dollar
	//increase the balance of the account  by 100;
	
	//create another class caled BankActivity with main method
	//create bank account object
	//set account holder name and balance value 
	//call your showAccountHolder and shoeBalance method
	
	//OPTIONALLY CALL YOUR add100Dolar method AGAIN TO SEE WHETHER BALANCE HAS CHANGED
	
public void showAccountHolder() {
	System.out.println("Account Holder Name: "+accountHolder);
}

public void showBalance() {
	System.out.println("Your balance : "+balance);
}
//adding 100 to baance current value
 void add100Dollar() {
	balance +=100;
	System.out.println("Your new balance : "+ balance);
}
//adding <custom> x dollar to current balance
public void addDollar(int x) {
	balance+=x;
}
	
}
