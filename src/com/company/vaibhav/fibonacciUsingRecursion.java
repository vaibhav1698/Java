package com.company.vaibhav;

import java.util.Scanner;

public class fibonacciUsingRecursion
{
    static int fibonacci(int n)
    {
        int n1=0, n2=1, n3;
        if (n<=1)
            return n;
        else
            return (fibonacci(n-1) + fibonacci(n-2));

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms up to which Fibonacci Series is to be printed: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms is: ");
        for (int i = 0; i<n; i++)
        {
            System.out.println(fibonacci(i));
        }


    }
}
