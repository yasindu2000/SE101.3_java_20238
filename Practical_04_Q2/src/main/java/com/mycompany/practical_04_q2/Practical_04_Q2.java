package com.mycompany.practical_04_q2;

public class Practical_04_Q2 
{

    public static void main(String[] args) 
    {
        SuperB B1 = new SuperB();
        B1.setIt(2);
        B1.increase();
        B1.triple();
       
        System.out.println( B1.returnIt() ); 
        
        SubC C1 = new SubC();
        C1.setIt(2);
        C1.increase();
        C1.triple();
        
        System.out.println( C1.returnIt() ); 

    }
}

//output

/*
9
6

explanation 

Class SuperB and SubC are  create objects separatly 

Object B1
setIt()  method sets x to 2
increas() method increas the value of x by 1 (3)
triple() method multiplies x by 3 (9)
print value of x is as 9

Object C1
setIt()  method sets x to 2
increas() method increas the value of x by 1 (3)
triple() method in SubC class add 3 (6)
print value of x is as 6
*/
