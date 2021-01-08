package com.company.vaibhav;

import java.util.Scanner;

public class printPatternUsingFunction
{
    static void printPattern(int n)
    {
        for(int i = 0; i<n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
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
