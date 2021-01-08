package com.company.vaibhav;

public class methodOverloading
{
    static void func()
    {
        System.out.println("Method Overloading");
    }

    static void func(int a)
    {
        System.out.println(a);
    }

    static void func(int a, int b)
    {
        System.out.println("Another function for method overloading");
        System.out.println(a+b);
    }
    static void func(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        int a =69;
        int b = 31;

        //Seeing how method overloading works
        func();
        func(a);
        func(a,b);
        func("Vaibhav");
    }

}
