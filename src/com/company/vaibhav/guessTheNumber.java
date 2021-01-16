package com.company.vaibhav;
import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

class guessNumber
{
    int generatedNum;
    int inputByUser;
    int guessesAllowed = 0;

    public int getNoOfGuesses()
    {
        return guessesAllowed;
    }
    public void setNoOfGuesses(int guessesAllowed)
    {
        this.guessesAllowed = guessesAllowed;
    }
    guessNumber()
    {
        Random rand = new Random();
        this.generatedNum = rand.nextInt(100);
    }
    public void takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess any number between 1 and 100: ");
        inputByUser = sc.nextInt();
    }
    public boolean isCorrectNumber()
    {
        guessesAllowed++;
        if (inputByUser == generatedNum)
        {
            System.out.format("You guessed the number right! %d\nYou guessed it in %d attempts", generatedNum, guessesAllowed);
            return true;
        }
        else if(inputByUser < generatedNum)
        {
            System.out.println("Number is smaller than the correct Number!!");
        }
        else if(inputByUser > generatedNum)
        {
            System.out.println("Number is greater than the correct Number!!");
        }
        return false;
    }


}
public class guessTheNumber
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Number Guessing Game!");
        guessNumber user1 = new guessNumber();
        boolean game = false;
        while(!game)
        {
            user1.takeUserInput();
            game = user1.isCorrectNumber();
        }

    }
}
