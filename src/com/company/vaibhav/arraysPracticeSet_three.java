package com.company.vaibhav;

import java.util.Scanner;

public class arraysPracticeSet_three
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] phy_marks = new int[5];
        System.out.println("Enter the physics marks for each student: ");
        for (int i = 0; i<phy_marks.length; i++)
        {
            phy_marks[i] = sc.nextInt();
        }

        float avg = 0.00f;

        for (int i = 0; i<phy_marks.length; i++)
        {
            avg += phy_marks[i];

        }
        avg /= 5;

        System.out.println("Average physics marks is: " + avg);

    }
}
