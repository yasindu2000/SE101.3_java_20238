
package com.mycompany.alloop;

public class AllOOP {

    public static void main(String[] args)
    {
      
        BankAccount CheakingAccount = new CheakingAccount(100000,123456);
        BankAccount SavingAccount = new SavingAccount(20000,123456);

 

        System.out.println("Interest for Cheaking Account: Rs :" + CheakingAccount.calculateInterest());
        System.out.println("Interest for Saving Account: Rs :" + SavingAccount.calculateInterest());
    }
}
