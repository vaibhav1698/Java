package com.company.vaibhav;

public class ifElse2
{
    public static void main(String[] args)
    {
        //Logical  Operators
        int a = 10, b = 20;

        if (a>5 && b>10)
        {
            System.out.println("This will be printed if both conditions are true");
        }

        if (a<5 && b>5)
        {
            System.out.println("Lol");
        }
        else
        {
            System.out.println("one or both conditions not true hence AND doesn't evaluate to true");
        }

        if (a<5 || b>5)
        {
            System.out.println("For OR to be true if even one of the condition is true then OR evaluates to true");
        }
        else
        {
            System.out.println("lol");
        }
        ;
        if(a!=0)
        {
            System.out.println("Using NOT!");
        }
        boolean c = false;
        if (!c)
        {
            System.out.println("Yay!");
        }


    }
}
