package com.company.vaibhav;

public class loopsPractiseSet_6
{
    public static void main(String[] args)
    {
        //sum of the numbers occurring in the multiplication table of 8
        //or sum of multiples of 8
        int sum = 0;

        for(int i = 1; i<=10; i++)
        {
            sum += (8*i);
        }

        System.out.println("Sum of first 10 multiple of 8: " + sum);
    }
}
