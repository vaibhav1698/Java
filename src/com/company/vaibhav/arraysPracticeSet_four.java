package com.company.vaibhav;

import java.util.Scanner;

public class arraysPracticeSet_four
{
    public static void main(String[] args)
    {
        int [] [] matrix1 = new int [2][3];
        int [] [] matrix2 = new int [2][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for 1st Matrix: ");

        for(int i = 0; i<matrix1.length; i++)
        {
            for(int j = 0; j<matrix1[i].length; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for 2nd Matrix: ");

        for(int i = 0; i<matrix2.length; i++)
        {
            for(int j = 0; j<matrix2[i].length; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int [][] sum_of_matrices = new int [2][3];

        for (int i = 0; i<sum_of_matrices.length; i++)
        {
            for (int j = 0; j<sum_of_matrices[i].length; j++)
            {
                sum_of_matrices[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices are: ");
        for (int i = 0; i<sum_of_matrices.length; i++)
        {
            for (int j = 0; j<sum_of_matrices[i].length; j++)
            {
                System.out.print(sum_of_matrices[i][j] + " ");
            }
            System.out.println("\n");
        }



    }
}
