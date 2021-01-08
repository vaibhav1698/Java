package com.company.vaibhav;

import java.util.Scanner;

public class loopsPracticeSet_5
{   //factorial of a number using for loop
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find its factorial: ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1; i<=num; i++)
        {
            fact *=i ;
        }

        System.out.println("Factorial of " + num + ": " + fact);
    }
}
