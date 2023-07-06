
package com.mycompany.calareaobj;

public class Circule extends Shape 
{
   private float radius;
   public Circule(float radius)
   {
     this.radius=radius;  
   }
    @Override
    public float calculateArea() 
    {
        Area=3.14f*radius*radius;
        return Area;
        
    }
    
}
