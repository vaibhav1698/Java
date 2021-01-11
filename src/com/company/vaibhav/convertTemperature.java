package com.company.vaibhav;

import java.util.Scanner;

public class convertTemperature
{
    static float convertCToF(float temp)
    {

        temp = (temp * 9 / 5) + 32;
        return temp;
    }

    public static void main(String[] args)
    {
        float temp=0.00f;

        System.out.println("Enter the temperature in Celsius to convert: ");
        Scanner sc = new Scanner(System.in);

        temp = sc.nextFloat();
        System.out.println("Converted Temperature is: " + convertCToF(temp));

    }
}
