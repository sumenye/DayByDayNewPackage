package May26;

public class SavingAccount extends BankAccount{

	double returnRate;
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
	super(accountName, accountNumber, balance);
	this.returnRate=returnRate;
	}
	@Override
	public String toString() {
		return "SavingAccount [returnRate=" + returnRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}

//	public void deposit(int money) {
//		this.balance+=money ;
//		this.balance+=100;
//	}
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money);
		super.deposit(100);
	}
	
//	public void withdraw(int money) {
//	this.balance-=money;
//	this.balance-=10;
//}
	@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		super.withdraw(money);
		super.withdraw(10);
	}
	
	
	
	
	
	

	
	
	
	
	/*
Task 2 
	Create a BankAccount class 
		fields : 
			accountName as String
			accountNumber as long 
			balance as double 

		Constructor 
			3 args constructor to set all above value 

		methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
			withdraw accept one int as parameter
				and it changes the balance accordingly

	Create a sub class called SavingAccount 
		field : 
			double returnRate
		Constructor 
			4 args constructor to set all above value 

		overriden methods : 
			toString method
			deposit accept one int as parameter 
				and it changes the balance accordingly
				but you get 100$ for each deposit 
			withdraw accept one int as parameter
				and it changes the balance accordingly
				but you get 10$ penalty for each withdraw */
}
