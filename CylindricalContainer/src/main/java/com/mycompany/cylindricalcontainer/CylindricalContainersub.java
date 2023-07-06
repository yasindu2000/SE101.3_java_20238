
package com.mycompany.cylindricalcontainer;

public class CylindricalContainersub extends Container
{
   private double height;
   private double radius;
   
   public CylindricalContainersub(double height,double radius)
   {
      this.height=height;
      this.radius=radius;
   }
    @Override
    public double volume() 
    {

        double volume=3.14*radius*radius*height;
        return volume ;

        
    }
    
}
