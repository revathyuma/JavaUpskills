package abstraction;

public abstract class Account {

	private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        // Implementation for depositing into a savings account
    }

    public void withdraw(double amount) {
        // Implementation for withdrawing from a savings account
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        // Implementation for depositing into a current account
    }

    public void withdraw(double amount) {
        // Implementation for withdrawing from a current account
    }
}





