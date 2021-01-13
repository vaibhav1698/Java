package com.company.vaibhav;

class myEmployee
{
    private int id;
    private String name;

    public void setName(String n) //setter
    {
        name = n;
    }

    public String getName() //getter
    {
        return name;
    }

    public void setId(int i) //setter
    {
        id = i;
    }

    public int getId() //getter
    {
        return id;
    }
}

public class accessSpecifiers
{
    public static void main(String[] args)
    {
        myEmployee xyz = new myEmployee();
        xyz.setName("xyz");
        System.out.println("My name is: " + xyz.getName());
        xyz.setId(69);
        System.out.println("My id is: " + xyz.getId());
    }
}
