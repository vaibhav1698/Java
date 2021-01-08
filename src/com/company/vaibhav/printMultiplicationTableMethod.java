package com.company.vaibhav;

import java.util.Scanner;

public class printMultiplicationTableMethod
{
    static void printMultiplication(int n)
    {

        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i<=10; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number whose Multiplication Table is to be printed: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printMultiplication(n);
    }
}
