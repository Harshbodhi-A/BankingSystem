package Bankingsystem;

public class Bank {

	private Account[] accounts;
	private int accountCount;
	
	
	
	public Bank(int size) {
		accounts = new Account[size];
		accountCount = 0;
	}

	public void addAcount(Account account) {
		if(accountCount < accounts.length) {
			accounts[accountCount++] = account;
		}
		else {
			System.out.println("Bank is full capacity");
		}
	}
	
	public void removeAccount(int accountNumber) {
		for(int i=0; i < accountCount; i++) {
			if(accounts[i].accountNumber == accountNumber) {
				accounts[i] = accounts[--accountCount];
				accounts[accountCount]=null;
				System.out.println("Account " + accountNumber + " removed");
			}
		}
	}
	
	public void displayAccount() {
		for(int i=0; i < accountCount; i++) {
			System.out.println(accounts[i].getAccountInfo());
		}
	}
}
