public class BankAccount
{
    double balance;
    
    public BankAccount(double balance) // constructor
    {
        this.balance = balance;
    }

    public BankAccount()
    {
        this.balance = 100.00
    }

    public void withdraw(double amount)
    {
    	balance =+ amount;
    }

    public void deposit(double amount)
    {
    	balance += amount;
    }

    public double getBalance() // retrieving this data so just use public double etc
    {
        return balance;
    }

    public void setBalance(double amount) // normal method so using void
    {
        balance = amount;
    }

    public String toString()
    {
        return "The balance is " + balance;
    }
}