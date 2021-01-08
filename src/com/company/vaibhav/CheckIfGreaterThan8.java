package com.company.vaibhav;

import java.util.Scanner;

public class CheckIfGreaterThan8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is greater than 8 or not: ");
        int num = sc.nextInt();
        System.out.println(num>8);
    }
}
