package Bankingsystem;

public class SavingAccount extends Account {
	
	private double interestRate;
	

	public SavingAccount(int accountNumber, String accountHolderName, double balance, double interesstRate) {
		super(accountNumber, accountHolderName, balance, "Savings" );
		this.interestRate = interesstRate;
	}

	@Override
	public void deposite(double amount) {
		if(amount > 0) {
			balance = balance + amount;
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient funds for withdraw");
		}
		
	}

	@Override
	public String getAccountInfo() {
		
		return "Account Number : " + accountNumber + " Account Holder : " + accountHolderName + ", Balance : " + balance + ", Account Type : " + accountType ;
	}

	public double calculateInterest() {
		return balance * interestRate;
	}
	
	
}
