package encapsulationDemo;

public class BankApp {
public static void main(String[] args)
{
BankAccount account1 = new BankAccount(123456,1000.00, "reva");
BankAccount account2 = new BankAccount(98234,2000.00, "sang");
account1.deposit(200.00);
account1.withdraw(100.00);
account2.deposit(2000.00);
account2.withdraw(3000.00);

System.out.println("Account1:"+ account1.getAccountHolderName() + "Balance: " + account1.getinitalBalance());
System.out.println("Account2:"+ account2.getAccountHolderName() + "Balance: " + account2.getinitalBalance());
}
}
