package com.company.vaibhav;

class myBase
{
    myBase()
    {
        System.out.println("This is a constructor!");
    }
    myBase(int a)
    {
        System.out.println("This is an overloaded constructor!");
        System.out.println("The derived class will invoke this constructor using the super keyword! ");
        System.out.println("The value of a is: " + a);
    }

}
class myDerived extends myBase
{
    myDerived()
    {
        System.out.println("This is the constructor from the Derived Class");
    }
    myDerived(int a, int b)
    {
        super(a);
        System.out.println("This is the overloaded constructor of the derived class!");
        System.out.println("The value b is: "+ b);
    }

}
class childOfDerived extends myDerived
{
    childOfDerived()
    {
        System.out.println("This is a child of the derived constructor");
    }
    childOfDerived(int a, int b, int c)
    {
        super(a,b);
        System.out.println("This is an overloaded constructor of the derived class");
        System.out.println("The value of c is: " + c);
    }
}
public class constructorsInInheritance
{
    public static void main(String[] args)
    {
        myBase one = new myBase();
        myDerived two = new myDerived();
        myDerived two_two = new myDerived(5, 10);
        childOfDerived three = new childOfDerived();
        childOfDerived four = new childOfDerived(4,5,6);
    }
}
