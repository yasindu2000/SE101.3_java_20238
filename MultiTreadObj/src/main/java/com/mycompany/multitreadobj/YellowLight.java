
package com.mycompany.multitreadobj;

public class YellowLight extends Thread
{
    
    public void run()
    {
        try{
            while(true)
            {
                System.out.println("yellow light");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
                {
                    System.out.println(e.getMessage());    
                }
        
    }
}
