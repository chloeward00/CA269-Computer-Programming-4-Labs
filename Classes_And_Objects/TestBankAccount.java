public class TestBankAccount
{
   public static void main(String [] args)
   {
      BankAccount currentAccount = new BankAccount(10000.00);

      System.out.println("The balance is " + currentAccount.balance);

      currentAccount.withdraw(100.00);

      System.out.println("The balance is " + currentAccount.balance);
   }
}