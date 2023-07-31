package com.mycompany.practical_04_q1;

public class Employee 
{
    private int empID;
    private String  empName;
    private String empDesignation;
    
    public void setempid(int ID)
    {
        this.empID = ID;
    }
    
    public void setname(String name)
    {
        this.empName = name;
    }
    
    public void setdesignation(String designation)
    {
        this.empDesignation = designation;
    }
    
    public int getempid()
    {
        return empID;
    }
    
    public String getname()
    {
        return empName;
    }
    
    public String getdesignation()
    {
        return empDesignation;
    }
}
