package com.company.vaibhav;

import java.util.Scanner;

public class methods
{
    static int sum(int x, int y)
    {
        return x+y;
    }

    int conditionalSum(int a, int b)
    {
        if (a>b)
        {
            return a+b;
        }

        else
        {
            return ((10*a) + b);
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Sum of " + a + " and " + b + " is equal to = ");
        System.out.println(sum(a,b));

        //using non static method by creating an object



        System.out.println("Enter the first number: ");
        int a1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b1 = sc.nextInt();

        methods sum2 = new methods();
        int c = sum2.conditionalSum(a1, b1);

        System.out.print("Sum of " + a1 + " and " + b1 + " is equal to = ");
        System.out.println(c);





    }
}
