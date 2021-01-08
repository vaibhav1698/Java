package com.company.vaibhav;
import java.util.Scanner;

public class CGPACalculator
{
    public static void main(String[] args)
    {
        int marks1, marks2, marks3;
        float perc1, cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Subject Marks: ");
        marks1 = sc.nextInt();
        System.out.print("Enter 2nd Subject Marks: ");
        marks2 = sc.nextInt();
        System.out.print("Enter 3rd Subject Marks: ");
        marks3 = sc.nextInt();

        perc1 = ((marks1 + marks2 + marks3)/300.00f) * 100;
        cgpa = perc1/9.50f;

        System.out.printf("%.1f", cgpa);
    }
}
