package com.company.vaibhav;

import java.util.Scanner;

public class printReversePatternUsingRecursion
{
    static void printRevPattern(int n)
    {

        if(n>0)
        {

            for(int i=n; i>0; i--)
            {
                System.out.print("*");
            }
            System.out.println();
            printRevPattern(n-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of pattern you want to print: ");
        int n = sc.nextInt();

        printRevPattern(n);
    }
}
