package com.company.vaibhav;

import java.util.Scanner;

public class loopsPracticeSet_4
{   //print multiplication of a table in reverse
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose multiplication table you want to be printed: ");
        int n = sc.nextInt();


        for(int i = 10; i>=1; i--)
        {
            System.out.println(n + " x " + i + " = " + n*i );
        }
    }
}
