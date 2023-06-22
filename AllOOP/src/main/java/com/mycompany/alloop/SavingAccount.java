
package com.mycompany.alloop;

public  class SavingAccount extends BankAccount
{

    public SavingAccount(double balance, int Accountno) {
        super(balance, Accountno);
    }
   
    @Override
   public double calculateInterest()
 {
      return  getbalance()*0.02; 
 }
    
}
