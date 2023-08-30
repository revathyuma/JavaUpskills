package abstraction;

public class BankAccount {
	
	    public static void main(String[] args) {
	        Account savingsAccount = new SavingsAccount("SA123", 1000);
	        Account currentAccount = new CurrentAccount("CA456", 2000);

	        savingsAccount.displayBalance();
	        savingsAccount.deposit(500);
	        savingsAccount.withdraw(200);

	        currentAccount.displayBalance();
	        currentAccount.deposit(1000);
	        currentAccount.withdraw(300);
	    }
}
