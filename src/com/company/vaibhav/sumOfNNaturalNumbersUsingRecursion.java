package com.company.vaibhav;

import java.util.Scanner;

public class sumOfNNaturalNumbersUsingRecursion
{
    static int sumNatural(int n)
    {
        int sum = 0;
        if (n!=0)
        {
            return n + sumNatural(n-1);
        }
        else
            return n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which sum of natural numbers is to be printed: ");
        int n = sc.nextInt();

        System.out.println("Sum of Natural Numbers up to " + n + " = " + sumNatural(n));

    }
}
