public class BankAccount
{
    double balance;
    
    public BankAccount(double balance) // constructor
    {
        this.balance = balance;
    }

    public BankAccount()
    {
        this.balance = 100.00;
    }

    public void withdraw(double amount)
    {
    	balance +- amount;
    }

    public void deposit(doublie amount)
    {
    	balance += amount;
    }
}