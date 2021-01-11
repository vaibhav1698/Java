package com.company.vaibhav;

import java.util.Scanner;

public class calculateAverage
{
    static int avg(int ... arr)
    {
        int average = 0;
        for(int i = 0; i<arr.length;i++)
        {
            average += arr[i];
        }
        average /= arr.length;
        return average;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms whose average is to be calculated: ");
        n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter Numbers: ");
        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.println("The average of the number input by the user is: " + avg(nums));


    }
}
