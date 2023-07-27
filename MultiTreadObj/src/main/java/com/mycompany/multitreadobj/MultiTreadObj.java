
package com.mycompany.multitreadobj;


public class MultiTreadObj {

    public static void main(String[] args) 
    {
        GreenLight glThread=new GreenLight();
        YellowLight ylThread=new YellowLight();
        RedLight rlThread=new RedLight();
        
       glThread.start();
       ylThread.start();
       rlThread.start();
        
       
    }
}
