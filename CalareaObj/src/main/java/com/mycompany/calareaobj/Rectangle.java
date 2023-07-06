
package com.mycompany.calareaobj;

public class Rectangle extends Shape
{
      private float length;
      private float width;
      public Rectangle(float length,float width)
      {
          this.length=length;
          this.width=width;
      }
    @Override
    public float calculateArea() 
    {
        Area = length*width;
        return Area;
        
    }
    
}
