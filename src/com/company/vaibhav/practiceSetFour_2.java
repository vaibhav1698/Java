package com.company.vaibhav;

import java.util.Scanner;

public class practiceSetFour_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int salary;

        System.out.print("Enter your salary (in Lakhs): ");
        salary = sc.nextInt();

        float tax = 0.00f;

        if (salary > 250000 && salary < 500000)
        {
            salary = salary - 250000;
            tax = tax + 0.05f*salary;
            System.out.printf("Task paid by this employee is: %2.2f", tax);
        }
        else if (salary >= 500000 && salary < 1000000)
        {
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (salary - 500000);
            System.out.printf("Task paid by this employee is: %2.2f", tax);
        }
        else if (salary >= 1000000)
        {
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (1000000 - 500000);
            tax = tax + 0.3f * (salary - 1000000);
            System.out.printf("Task paid by this employee is: %2.2f", tax);
        }
        else
        {
            System.out.println("Your salary is not taxable");
        }



    }
}
