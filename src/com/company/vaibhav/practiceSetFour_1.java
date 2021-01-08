package com.company.vaibhav;

import java.util.Scanner;

public class practiceSetFour_1
{
    public static void main(String[] args)
    {
        //check if a student has passed are not
        //passing criteria : total 40 % and at least 33% in each subject
        //input subject of 3 marks

        Scanner sc = new Scanner(System.in);
        int marks1, marks2, marks3;

        float avg = 0.00f;

        System.out.print("Enter marks of 1st subject: ");
        marks1 = sc.nextInt();
        System.out.print("Enter marks of 2nd subject: ");
        marks2 = sc.nextInt();
        System.out.print("Enter marks of 3rd subject: ");
        marks3 = sc.nextInt();

        avg = (marks1 + marks2 + marks3)/3.00f;

        if (avg>40 && marks1>33 && marks2>33 && marks3>33)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Better luck next time!");
        }

    }
}
