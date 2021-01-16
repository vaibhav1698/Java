package com.company.vaibhav;
import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

class guessNumber
{
    Random rand = new Random();
    int limit = 51;
    int random_int;
    int guess;

    public guessNumber()
    {
        random_int = rand.nextInt(limit);

    }
    public int takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        guess = sc.nextInt();
        return guess;
    }
    public boolean isCorrectNumber(int guessN)
    {
        if (random_int == guessN)
        {
            return true;
        }
        else
        {
            if (Math.abs(random_int - guessN) >= 20)
            {
                System.out.println("Guess too far");
                return false;
            }
            return false;
        }
    }


}
public class guessTheNumber
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Guess any number between 1 and 50: ");
        guessNumber user1 = new guessNumber();
        int number = user1.takeUserInput();
        boolean check = user1.isCorrectNumber(number);


        if (check)
        {
            System.out.println("Your guess was correct!");
        }
        else
        {
            System.out.println("Incorrect Guess!");
            System.out.println("The correct number was: " + user1.random_int);
        }

    }
}
