package com.company.vaibhav;

import java.util.Scanner;

public class forLoop
{
    public static void main(String[] args)
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.println(i);
        }

        //printing n odd numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of odd numbers you want to print: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " odd numbers are: ");
        for (int i=0; i<n; i++)
        {
            System.out.println(2*i+1); //2n+1 gives odd number so we iterate i and use 2i+1
        }

        for (int i =8; i!=0; i--)
        {
            System.out.println(i);
        }

        //printing first n natural numbers in reverse order

        System.out.println("Enter number of natural numbers you want to print in reverse");
        n = sc.nextInt();
        System.out.println("First " + n + " natural numbers in reverse order are: ");

        for(int i = n; i>0; i--)
        {
            System.out.println(i);
        }
    }
}
