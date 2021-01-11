package com.company.vaibhav;

import java.util.Scanner;

public class fibonacciUsingIterative {
    static int fibonacci(int n) {
        int t1 = 0, t2 = 1, sum=0;
        for (int i = 1; i <= n; i++) {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms up to which Fibonacci Series is to be printed: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

}
