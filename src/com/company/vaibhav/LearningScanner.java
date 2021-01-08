package com.company.vaibhav;
import java.util.Scanner;


public class LearningScanner
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in); //creating scanner object for inputs
        System.out.println("Enter number 1:");
        int a = sc.nextInt(); //used for input of integer value
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of these numbers is: " + sum);

        //System.out.println("Enter another number");

        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);

        System.out.println("Enter your name");
        String w = sc.next();
        System.out.println("Your name is " + w);
        System.out.println("Again enter your name");
        sc.nextLine(); // Adding this as to stop the skipping to the next line
        //remove this and run to understand
        String st = sc.nextLine();
        System.out.println("Your name is " + st);
    }
}
