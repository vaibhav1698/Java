package com.company.vaibhav;

import java.util.Scanner;

public class loopsPracticeSet_2
{   //print sum of first n even numbers
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many integers from the first to be added: ");
        int n = sc.nextInt();

        int i = 1, sum = 0;

        while(i<=n)
        {
            sum += 2*i;
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers is : " + sum);
    }
}
