package com.company.vaibhav;

class myMainEmployee
{
    private int id;
    private String name;

    public myMainEmployee()
    {
        id = 69;
        name = "XYZ";
    }
    public myMainEmployee(int myId, String myName) //parameterised constructor, it can accept more parameters
    {
        id = myId;
        name = myName;
    }
    public void setName(String n) //setter
    {
        this.name = n;
    }

    public String getName() //getter
    {
        return name;
    }

    public void setId(int i) //setter
    {
        this.id = i;
    }

    public int getId() //getter
    {
        return id;
    }
}
public class constructorsInJava
{
    public static void main(String[] args)
    {
        myMainEmployee xyz = new myMainEmployee();
        System.out.println(xyz.getId());
        System.out.println(xyz.getName());
        myMainEmployee xyz2 = new myMainEmployee(69, "XYZ2");
        System.out.println(xyz2.getId());
        System.out.println(xyz2.getName());

    }
}
