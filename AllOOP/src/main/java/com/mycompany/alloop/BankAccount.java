
package com.mycompany.alloop;

public abstract class BankAccount 
{
    private double balance;
    private int accountno;
    
    BankAccount(double balance,int Accountno)
    {
        this.balance=balance;
        this.accountno=accountno;
    }
   public void setbalance(double balance)
    {
        this.balance=balance;
    }
   public double getbalance()
    {
        return balance;
    }

    public int getaccountno() {
        return accountno;
    }

    public void setaccountno(int accountno) 
    {
        this.accountno = accountno;
    }
   public abstract double calculateInterest();
    
}
