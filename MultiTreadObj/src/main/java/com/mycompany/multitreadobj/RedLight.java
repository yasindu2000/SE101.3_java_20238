
package com.mycompany.multitreadobj;

public class RedLight extends Thread
{
    
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("red light");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
