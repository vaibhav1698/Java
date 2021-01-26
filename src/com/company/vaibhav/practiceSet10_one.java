package com.company.vaibhav;

import java.util.Scanner;

class Circle2
{
    public int radius;

    Circle2(int r)
    {
        this.radius = r;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * Math.pow(radius,2);
    }
}

class Cylinder4 extends Circle2
{
    int height;
    Cylinder4(int r, int h)
    {
        super(r);
        this.height = h;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public double volume()
    {
        return Math.PI * Math.pow(radius,2) * height;
    }
}

public class practiceSet10_one
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of Circle: ");

        Circle2 newCircle = new Circle2(sc.nextInt());
        System.out.println("Area of the circle is: " + newCircle.area());



        System.out.println("The above circle was made into a cylinder so radius of the new Cylinder is same as that of the circle");
        Cylinder4 newCylinder = new Cylinder4(newCircle.getRadius(),sc.nextInt());
        System.out.println("Volume of the Cylinder is: " + newCylinder.volume());


    }
}
