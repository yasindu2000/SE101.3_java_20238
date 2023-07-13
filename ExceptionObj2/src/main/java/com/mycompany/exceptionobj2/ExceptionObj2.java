
package com.mycompany.exceptionobj2;

public class ExceptionObj2 {

    public static void main(String[] args)
    { 
        try
        {
        int arry[]=new int[5];
       arry[5]=10;
            System.out.println("Last Value " + arry[5]);
        }
        catch(Exception e)
        {
            System.out.println("The arry is out of bound");
        }
                
    }
}
