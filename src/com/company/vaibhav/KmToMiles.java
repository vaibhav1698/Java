package com.company.vaibhav;

import java.util.Scanner;

public class KmToMiles
{
    public static void main(String[] args)
    {
        float km, miles;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the kilometer value which is to be converted to miles: ");
        km = sc.nextFloat();

        miles = km*0.621371f;

        System.out.print("The value in miles is: ");
        System.out.printf("%.2f", miles);
    }
}
