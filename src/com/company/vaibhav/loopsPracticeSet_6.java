package com.company.vaibhav;

import java.util.Scanner;

public class loopsPracticeSet_6
{   //factorial of a number using while loop
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find its factorial: ");
        int num = sc.nextInt();

        int fact = 1;

        int i = 1;

        while(i<=num)
        {
            fact*=i;
            i++;
        }

        System.out.println("Factorial of " + num + ": " + fact);
    }
}
