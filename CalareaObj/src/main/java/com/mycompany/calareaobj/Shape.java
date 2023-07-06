
package com.mycompany.calareaobj;

abstract class Shape 
{
    protected float Area;
    public abstract float calculateArea();
    public void display()
    {
        System.out.println("Area is " + Area);
    }
}
