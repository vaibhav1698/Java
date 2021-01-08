package com.company.vaibhav;

import java.util.Scanner;

public class CheckInputForInteger
{
    public static void main(String[] args)
    {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to be checked: ");

        System.out.println(sc.hasNextInt());
    }
}
