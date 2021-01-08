package com.company.vaibhav;

public class Operators
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 10 + a;
        int c = 12 - a;

        c+=b;
        b-=a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b<=c); //comparison operator
        System.out.println(a>=c); //comparison operator
        System.out.println(a==b); //comparison operator
        System.out.println(2&3); //bitwise operator
    }
}
