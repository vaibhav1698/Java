package com.company.vaibhav;
import java.util.Scanner;

public class CBSEMarksCalculator
{
    public static void main(String[] args)
    {
        int marks1, marks2, marks3, marks4, marks5, total;
        float perc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for the 1st Subject: ");
        marks1 = sc.nextInt();
        System.out.println("Enter marks for the 2nd Subject: ");
        marks2 = sc.nextInt();
        System.out.println("Enter marks for the 3rd Subject: ");
        marks3 = sc.nextInt();
        System.out.println("Enter marks for the 4th Subject: ");
        marks4 = sc.nextInt();
        System.out.println("Enter marks for the 5th Subject: ");
        marks5 = sc.nextInt();


        perc = ((marks1 + marks2 + marks3 + marks4 + marks5)/500.00f) * 100;

        System.out.print("Percentage of the Student is: ");
        System.out.printf("%.2f", perc);

    }
}
