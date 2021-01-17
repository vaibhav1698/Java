package com.company.vaibhav;

import java.util.Scanner;

public class printRightAllignedPattern
{
    static void printPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("#");
            }

            System.out.println();

        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of pattern to be printed: ");
        int n = sc.nextInt();

        printPattern(n);
    }
}
