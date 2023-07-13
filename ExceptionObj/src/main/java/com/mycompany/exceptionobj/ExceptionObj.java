
package com.mycompany.exceptionobj;
import java .util .Scanner;
public class ExceptionObj {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no1,no2,answer;
        System.out.println("Enter first Number:");
        no1=sc.nextInt();
        System.out.println("Enter Second Number:");
        no2=sc.nextInt();
        
        try
        {
            answer=no1/no2;
            System.out.println("Answer is " + answer);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:Divided by Zero");
        }
        
    }
}
