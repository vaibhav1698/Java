package com.company.vaibhav;

import java.util.Scanner;

public class arraysPracticeSet_two
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] array2 = new int[10];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<array2.length; i++)
        {
            array2[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find: ");
        int num = sc.nextInt();

        for(int i = 0; i<array2.length; i++)
        {
            if (array2[i] == num)
            {
                System.out.println(num + " Found!");
                break;
            }
        }


    }

}
