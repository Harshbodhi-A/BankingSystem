package Bankingsystem;

public class CheckingAccount extends Account {

	

	private double overdraftLimit;
	
	public CheckingAccount(int accountNumber, String accountHolderName, double balance,double overdraftLimit) {
		super(accountNumber, accountHolderName, balance, "Checking");
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposite(double amount) {
		if(amount > 0) {
			balance = balance + amount;
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <= (balance + overdraftLimit)) {
			balance = balance -amount;
		}
		else {
			System.out.println("Insufficient funds for withdraw");
		}
		
	}

	@Override
	public String getAccountInfo() {
		
		return "Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + 
	               ", Balance: " + balance + ", Account Type: " + accountType;
	}
	
	public boolean checkOverdraft(double amount) {
		return amount <= (balance + overdraftLimit);
	}
	
}
