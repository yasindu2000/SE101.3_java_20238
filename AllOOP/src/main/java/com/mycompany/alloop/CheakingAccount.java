
package com.mycompany.alloop;

public class CheakingAccount extends BankAccount
{

    public CheakingAccount(double balance, int Accountno) {
        super(balance, Accountno);
    }

    @Override
    public double calculateInterest() 
    {
       
        return getbalance() * 0.12;
        
    }
    
   
    
}
