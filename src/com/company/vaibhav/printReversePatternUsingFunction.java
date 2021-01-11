package com.company.vaibhav;

import java.util.Scanner;

public class printReversePatternUsingFunction
{
    static void printReversePattern(int n)
    {
        for(int i = n-1; i>=0; i--) {
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

        printReversePattern(n);
    }
}
