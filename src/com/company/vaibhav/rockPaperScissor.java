package com.company.vaibhav;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rounds you want to have: ");
        int rounds = sc.nextInt();

        int win_user = 0;
        int win_comp = 0;

        int i = 0;

        int limit = 3;



        while ( i < rounds)
        {
            int computer_choice = rand.nextInt(limit);

            System.out.println("Choices: \n 1. Rock\n 2. Paper \n 3. Scissor");
            System.out.println("User's choice: ");

            int user_choice = sc.nextInt();



            if (user_choice == 1)
            {
                System.out.println("User chose Rock");
                if (computer_choice == 0)
                {
                    System.out.println("Computer chose Rock");
                    System.out.println("Tie!");
                }
                else if (computer_choice == 1)
                {
                    System.out.println("Computer chose Paper");
                    System.out.println("Computer Wins!");
                    win_comp++;
                }
                else if (computer_choice == 2)
                {
                    System.out.println("Computer Chose Scissor!");
                    System.out.println("User Wins!");
                    win_user++;
                }
                else
                {
                    System.out.println("Invalid Choice!");
                }
            }
            else if (user_choice == 2)
            {
                System.out.println("User chose Paper");
                if (computer_choice == 0)
                {
                    System.out.println("Computer chose Rock");
                    System.out.println("User Wins!");
                    win_user++;
                }
                else if (computer_choice == 1)
                {
                    System.out.println("Computer chose Paper");
                    System.out.println("Tie!");
                }
                else if (computer_choice == 2)
                {
                    System.out.println("Computer chose Scissor");
                    System.out.println("Computer Wins!");
                    win_comp++;
                }
                else
                {
                    System.out.println("Invalid Choice!");
                }
            }
            else if (user_choice == 3)
            {
                System.out.println("User chose Scissor");
                if (computer_choice == 0)
                {
                    System.out.println("Computer chose Rock");
                    System.out.println("Computer Wins!");
                    win_comp++;
                }
                else if (computer_choice == 1)
                {
                    System.out.println("Computer chose Paper");
                    System.out.println("User Wins!");
                    win_user++;
                }
                else if (computer_choice == 2)
                {
                    System.out.println("Computer chose Scissor");
                    System.out.println("Tie!");
                }
                else
                {
                    System.out.println("Invalid Choice!");
                }
            }
            else
            {
                System.out.println("Invalid Output!");
            }

            i++;
        }
        if (win_user > win_comp)
        {
            System.out.println("User won more no. of rounds!");
        }
        else if (win_comp > win_user)
        {
            System.out.println("Computer won more no. of rounds!");
        }
        else
        {
            System.out.println("Tie!");
        }

    }
}
