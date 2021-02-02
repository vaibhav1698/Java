package com.company.vaibhav;

abstract class BaseClass
{
    public BaseClass()
    {
        System.out.println("This is the constructor!");
    }

    public void greeting()
    {
        System.out.println("Hello!");
    }

    abstract public void greet();
}

class DerivedClass extends BaseClass
{
    @Override
    public void greet()
    {
        System.out.println("Good Morning!");
        /* if we don't override here, then it will give an error
        as when deriving from an abstract class, the derived class must
        implement the abstract method or be an abstract class of its own!
         */
    }
}

public class abstractClassAndAbstractMethods
{
    public static void main(String[] args)
    {
        DerivedClass dc = new DerivedClass();
        dc.greeting();
        dc.greet();

    }
}
