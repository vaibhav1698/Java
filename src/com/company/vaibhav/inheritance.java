package com.company.vaibhav;

import java.util.Scanner;

class Base
{
    int x;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
//        System.out.println("I am setting x now!");
        this.x = x;
    }
}

class Derived extends Base
{
    int y;

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
//        System.out.println("I am setting y now");
        this.y = y;
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating an Object of Base Class!");
        Base first = new Base();
        System.out.println("Enter the value for x: ");
        first.setX(sc.nextInt());

        System.out.println("Now, Creating an Object of the Derived Class");
        Derived second = new Derived();
        System.out.println("Enter new value for x: ");
        second.setX(sc.nextInt());
        System.out.println("Enter the value for y: ");
        second.setY(sc.nextInt());

        System.out.print("Sum of x and y is: ");
        System.out.print(second.getX() + second.getY());

    }
}


