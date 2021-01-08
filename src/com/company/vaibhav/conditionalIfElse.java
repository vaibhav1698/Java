package com.company.vaibhav;

import java.util.Scanner;

public class conditionalIfElse
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        a = sc.nextInt();

        if(a>18)
        {
            System.out.println("You can drive now!");
        }
        else
        {
            System.out.println("NO! You can't drive yet!");
        }


    }
}
