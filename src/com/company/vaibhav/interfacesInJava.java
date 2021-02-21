package com.company.vaibhav;

import java.util.Scanner;

interface Bicycle
{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Colour
{
    void cycleColour(String colour);
}

class avonCycle implements Bicycle, Colour
{
    int speed = 7;
    String colour = "Black";
    public void applyBrake(int decrement)
    {
        speed = speed - decrement;
    }
    public void speedUp(int increment)
    {
        speed = speed + increment;
    }
    public void cycleColour(String colour1)
    {
        colour = colour1;
        System.out.println("Colour of this Bicycle is: " + colour);
    }
}


public class interfacesInJava
{
    public static void main(String[] args)
    {
        avonCycle myCycle = new avonCycle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Which colour is your Bicycle?");
        String colour = sc.nextLine();
        myCycle.cycleColour(colour);
        System.out.println("How much speed are you currently travelling at?");
        myCycle.speed = sc.nextInt();



        boolean travelling = true;
        while(travelling)
        {
            System.out.println("Do you want to increase or decrease your speed? \n Press \n 1.Increase your speed \n 2. Decrease your speed");
            int choice = sc.nextInt();
            int speed;

            if (choice == 1)
            {
                System.out.println("How much speed do you want to increase?");
                speed = sc.nextInt();
                myCycle.speedUp(speed);
                System.out.println("Current speed: " + myCycle.speed);
            }
            else if (choice == 2)
            {
                System.out.println("How much speed do you want to decrease?");
                speed = sc.nextInt();
                myCycle.applyBrake(speed);
                System.out.println("Current speed: " + myCycle.speed);
            }
            else
            {
                System.out.println("Invalid Choice!");
            }

            System.out.println("Are you still travelling?\n Press \n 1. Yes \n 2. No");
            choice = sc.nextInt();
            if (choice == 1)
            {
                travelling = true;
            }
            else if (choice == 2)
            {
                travelling = false;
                System.out.println("Travel safe and Good Bye!");
            }
            else
            {
                System.out.println("Invalid Choice!");
            }


        }


    }
}
