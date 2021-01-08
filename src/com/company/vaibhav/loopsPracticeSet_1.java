package com.company.vaibhav;

import java.util.Scanner;
//print * pattern
public class loopsPracticeSet_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lines of * pattern you want to print: ");
        int i = sc.nextInt();

        for (; i>0; i--)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}
