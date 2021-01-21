package com.company.vaibhav;

class Phone
{
    public void name()
    {
        System.out.println("I am using Java!");
    }
    public void greet()
    {
        System.out.println("Hello!");
    }
}

class SmartPhone extends Phone
{
    public void welcome()
    {
        System.out.println("You are Welcome!");
    }
    @Override
    public void name()
    {
        System.out.println("I am using Java in an Over-ridden Class!");
    }

}

public class dynamicMethodDispatch
{
    public static void main(String[] args)
    {
        Phone obj = new SmartPhone();
        obj.greet();
        obj.name();
        // obj.welcome(); not allowed!!


    }
}
