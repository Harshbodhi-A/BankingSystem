package Bankingsystem;

abstract class Account {
	
	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;
	protected String accountType;
	
	
	public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	

//	public Account(int accountNumber2, String accountHolderName2, double balance2, String accountType2) {
//		// TODO Auto-generated constructor stub
//	}



	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	public abstract String getAccountInfo();

}
