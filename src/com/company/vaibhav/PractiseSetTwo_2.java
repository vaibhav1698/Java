package com.company.vaibhav;

import java.util.Scanner;

public class PractiseSetTwo_2
{
    public static void main(String[] args)
    {
        float v, u, a, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Values: ");
        v = sc.nextFloat();
        u = sc.nextFloat();
        a = sc.nextFloat();
        s = sc.nextFloat();
        float result = (v*v - u*u)/(2*a*s);

        System.out.print("Value of the expression for the input values is: ");
        System.out.println(result);
    }
}
