package com.company.vaibhav;

import java.util.Scanner;

public class arraysPracticeSet_five
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] array69 = new int [10];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i<array69.length; i++)
        {
            array69[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i<array69.length-1; i++)
        {
            if (array69[i] > array69[i+1])
            {
                isSorted = false;
                break;
            }

        }

        if (isSorted == true)
            System.out.println("Array sorted");
        else
            System.out.println("Array not sorted");


    }
}
