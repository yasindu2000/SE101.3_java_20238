package com.mycompany.practical_04_q1;


public class Practical_04_Q1 
{

    public static void main(String[] args) 
    {
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        
        E1.setempid(123456);
        E1.setname("Mr.Bogdan ");
        E1.setdesignation("CEO");
        
        E2.setempid(456789);
        E2.setname("Ms.Bird ");
        E2.setdesignation("Software Engineer");
        
        System.out.println("Employee ID:"+E1.getempid());
        System.out.println("Employee Name:"+E1.getname());
        System.out.println("Designation:"+E1.getdesignation());
        
        System.out.println("\n");
        
        System.out.println("Employee ID:"+E2.getempid());
        System.out.println("Employee Name:"+E2.getname());
        System.out.println("Designation:"+E2.getdesignation());        
    }
}
