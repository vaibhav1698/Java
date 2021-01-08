package com.company.vaibhav;

import java.util.Scanner;

public class switchCase
{
    public static void main(String[] args)
    {
         int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        /* normal switch case
        switch (age)
        {
            case 18:
                System.out.println("Adult!");
                break;

            case 10:
                System.out.println("Not an Adult!");
                break;

            case 21:
                System.out.println("Job soon!");
                break;

            case 60:
                System.out.println("Retired!");
                break;

            default:
                System.out.println("Enjoy!");
        }

         */

        //Enhanced Switch
        switch (age) {
            case 18 -> System.out.println("Adult!");
            case 10 -> System.out.println("Not an Adult!");
            case 21 -> System.out.println("Job soon!");
            case 60 -> System.out.println("Retired!");
            default -> System.out.println("Enjoy!");
        }
    }
}
