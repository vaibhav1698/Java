package com.company.vaibhav;

public class Literals
{
    public static void main(String[] args)
    {
        byte age = 34; // int literal
        char ch = 'V'; // char literal
        float f1 = 5.6f; // float literal, we need to add f for floating literal
        double d1 = 4.66d; // double literal, we can also use D instead of d (not necessary as any decimal number is considered double literal
        long ageDion = 5666666666L; //we need to use l or L for creating long else it will be considered as an integer and will give an error for larger values
        short age1 = 56;
        boolean a = true;
        System.out.println(age);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(ageDion);
        System.out.println(age1);
        System.out.println(a);

        String name = "Vaibhav";
        System.out.println(name);

    }
}
