package com.mycompany.practical_04_q3;
public class Practical_04_Q3 
{

    public static void main(String[] args) 
    {
       Student stu = new Student();
        stu.setname("Avishka");
        stu.setId(25648);
        stu.setcourse("Data Science");

        Lecture lec = new Lecture();
        lec.setname("Mr. Gayan Perera");
        lec.setId(1456);
        lec.setprogramme("Software Engineering");

        System.out.println("Student Details:");
        System.out.println("Name: " + stu.getname());
        System.out.println("ID: " + stu.getId());
        System.out.println("Course: " + stu.getcourse());
        System.out.println("\n");

        System.out.println("Lecturer Details:");
        System.out.println("Name: " + lec.getname());
        System.out.println("ID: " + lec.getId());
        System.out.println("Programme: " + lec.getprogramme());
    }
}
