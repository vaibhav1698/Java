package com.company.vaibhav;

import java.util.Scanner;

public class twoDArrays
{
    public static void main(String[] args)
    {
        int [][] flats = new int [2][3];
        //A 2 Dimensional array of 2 rows and 3 columns
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array: ");

        for(int i = 0; i< flats.length; i++)
            for (int j = 0; j< flats[i].length; j++)
            {
                flats[i][j] = sc.nextInt();
            }
        for(int i = 0; i< flats.length; i++)
        {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
