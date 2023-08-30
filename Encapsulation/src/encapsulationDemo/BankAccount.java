package encapsulationDemo;

public class BankAccount {
private int accountNumber;
private double initalBalance;
private String accountHolderName;

public BankAccount(int accountNumber, double initialBalance, String accountHolderName)
{
this.accountNumber = accountNumber;
this.initalBalance = initalBalance;
this.accountHolderName = accountHolderName; 
}

public int getAccountNumber() {
	return accountNumber;
}

public double getinitalBalance() {
	return initalBalance;
}

public String getAccountHolderName() {
	return accountHolderName;
}
public void deposit(double amount)
{
	initalBalance += amount;
	
}
public void withdraw (double amount)
{
	if (amount <=initalBalance) {
		initalBalance -= amount;
	}
	else {
		System.out.println("insufficientbalance");
	}
}
}

