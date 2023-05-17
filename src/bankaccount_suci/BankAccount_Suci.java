/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount_suci;

/**
 *
 * @author Labkom M21
 */
public class BankAccount_Suci {
   String accountNumber;
   double balance;

  public BankAccount_Suci (String accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

  public void deposit(double amount) {
     System.out.println(balance += amount);
  }

  public void withdraw(double amount) {
      if (balance >= amount) {
         System.out.println( balance -= amount);
      } else {
          System.out.println("Insufficient balance");
      }
  }

  public double getBalance() {
      return balance;
  }


  public static void main(String[] args) {
    BankAccount_Suci bank1 = new BankAccount_Suci ("11223344", 0);
    System.out.println("Saldo: " + bank1.getBalance()); 
    System.out.print("Deposit: ");
   bank1.deposit(2000000);
    System.out.print("Withdraw: ");
    bank1.withdraw(300000);

    bank1.getBalance();
    System.out.println("Saldo Sisa: "+ bank1.getBalance());
  }
}
