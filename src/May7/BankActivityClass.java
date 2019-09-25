package May7;

public class BankActivityClass {

	public static void main(String[] args) {
		
		BankAccount customer1= new BankAccount();
		//customer1.accountHolder = "Ashraf";
		customer1.balance = 2935.6;
		
		customer1.showAccountHolder();
		customer1.showBalance();
		customer1.addDollar(5);
		customer1.showBalance();
		
		
		
System.out.println("----------");		
		
BankAccount customer2= new BankAccount();
//customer2.accountHolder = "Shahriyor";
customer2.balance = 2500;
customer2.showAccountHolder();
customer2.showBalance();
customer2.add100Dollar();
customer2.showBalance();
customer2.addDollar(200);
customer2.showBalance();

	}
		
		
	}


