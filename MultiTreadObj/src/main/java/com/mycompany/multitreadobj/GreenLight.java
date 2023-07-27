
package com.mycompany.multitreadobj;

public class GreenLight extends Thread
{
   
      public void run()
    {
        try
        {
            while(true)
            {
               System.out.println("green light");
               Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
                {
                    System.out.println(e.getMessage()); 
                }
    }  
    
    
}
