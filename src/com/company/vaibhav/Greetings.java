package com.company.vaibhav;
import java.util.Scanner;

public class Greetings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day!");
    }
}
