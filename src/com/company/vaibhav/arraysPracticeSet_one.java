package com.company.vaibhav;

import java.util.Scanner;

public class arraysPracticeSet_one
{
    public static void main(String[] args)
    {   //Find sum of float values in an array
        Scanner sc = new Scanner(System.in);

        float [] array1 = new float[5];
        float sum = 0.00f;

        System.out.println("Enter the values in the float array: ");
        for (int i = 0; i<array1.length; i++)
        {
           array1[i] = sc.nextFloat();
        }

        for (int i =0; i<array1.length; i++)
        {
            sum += array1[i];
        }

        System.out.println("Sum of the values in the float array is: " + sum);



    }
}
