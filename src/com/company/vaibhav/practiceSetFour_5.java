package com.company.vaibhav;

import java.util.Scanner;

public class practiceSetFour_5
{
    public static void main(String[] args)
    {
        String domain;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the website: ");
        domain = sc.next();

        if (domain.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if (domain.endsWith(".org"))
        {
            System.out.println("Organization Website");
        }
        else if (domain.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
