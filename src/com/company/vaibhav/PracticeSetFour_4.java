package com.company.vaibhav;

import java.util.Scanner;

public class PracticeSetFour_4
{
    public static void main(String[] args)
    {
        //check if the year is a leap year or not
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = sc.nextInt();

        if ((year%4==0 && year%100!=0) || (year%400==0))
        {
            System.out.println("The year " + year + " is a Leap Year!");
        }
        else
        {
            System.out.println("Not a Leap Year!");
        }
    }
}
