package Bankingsystem;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank(7);
		
		SavingAccount savings1 = new SavingAccount(420, "Aniker", 100000.0, 5.0);
        CheckingAccount checking1 = new CheckingAccount(752, "Nikhil", 50000.0, 2000.0);

        bank.addAcount(savings1);
        bank.addAcount(checking1);

        savings1.deposite(20000);
        savings1.withdraw(10000);
        checking1.deposite(30000);
        checking1.withdraw(7000);

        bank.displayAccount();

        double interest = savings1.calculateInterest();
        System.out.println("Interest earned on Aniket savings account: " + interest);

        

        bank.removeAccount(420);
        bank.displayAccount();
    }
	}

