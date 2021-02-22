package com.company.vaibhav;

import java.util.Scanner;

public class arrays
{
    public static void main(String[] args)
    {
        //storing marks of a class having 500 students
        int [] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements: ");
        for (int i = 0; i<marks.length; i++)
        {
            marks[i] = sc.nextInt();
        }

        //displaying the contents of array

        for(int i = 0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        //displaying the contents of the array in reverse order
        //new commit
        for(int i = marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }

        //for-each loop, another way of traversing in an array

        for(int element: marks)
        {
            System.out.println(element);
        }
    }
}
