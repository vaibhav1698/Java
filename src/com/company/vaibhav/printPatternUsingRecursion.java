package com.company.vaibhav;

import java.util.Scanner;

public class printPatternUsingRecursion
{
    static void printPattern(int n)
    {

        if(n>0)
        {

            for(int i=0; i<n; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            printPattern(n-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of pattern you want to print: ");
        int n = sc.nextInt();

        printPattern(n);
    }
}
