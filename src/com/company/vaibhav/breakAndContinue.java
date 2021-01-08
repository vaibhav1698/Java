package com.company.vaibhav;

public class breakAndContinue
{
    public static void main(String[] args)
    {
        for (int i=0; i<5; i++)
        {
            System.out.println(i);
            System.out.println("Java is Great");

            if (i==2)
            {
                System.out.println("Breaking out of loop once i is 2");
                break;
            }
        }

        for (int i=0; i<5; i++)
        {   if (i==2)
            {
                System.out.println("Continue encountered, moving to the next iteration");
                continue;
            }


            System.out.println(i);
            System.out.println("Java is Great");


        }


    }
}
