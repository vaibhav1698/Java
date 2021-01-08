package com.company.vaibhav;

import java.util.Scanner;

public class doWhileLoop
{
    public static void main(String[] args)
    {
        int i = 0;
        do
        {
            System.out.println(i);
            i++;
        }while(i<10);

        i = 10;

        do
        {
            System.out.println(i);
            i++;
        }while(i<5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many natural numbers you want to print: ");
        int n = sc.nextInt();

        i = 1;
        do
        {
            System.out.println(i);
            i++;
        }while(i<=n);

    }

}
