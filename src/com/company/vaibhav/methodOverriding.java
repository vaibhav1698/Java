package com.company.vaibhav;

class A
{
    public int a;
    public int method1()
    {
        return 1;
    }
    public void method2()
    {
        System.out.println("This is the method 2 of Class A!");
    }
    public void method3()
    {
        System.out.println("This is the method 3 of Class A!");
    }
}

class B extends A
{
    @Override //denotes method overriding
    public void method2()
    {
        System.out.println("Overloading the method 2 of A in B!");
        System.out.println("This is the method 2 of Class B!");
    }
}

public class methodOverriding
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        a.method2();
        b.method2();
        a.method1();
        a.method3();
    }
}
