package com.company.vaibhav;

import java.util.Scanner;

class Rectangle1
{
    public int length;
    public int breadth;


    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle1
{
    int height;

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
public class practiceSet10_two
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Rectangle1 rect = new Rectangle1();
        System.out.println("Enter Length of Rectangle: ");
        rect.setLength(sc.nextInt());
        System.out.println("Enter Breadth of Rectangle: ");
        rect.setBreadth(sc.nextInt());

        System.out.println("Area of the rectangle is: " + rect.getLength() * rect.getBreadth());

        System.out.println("The given rectangle is now extended to a cuboid with the same length and breadth.");
        System.out.println("Enter Height of Cuboid: ");
        Cuboid cuboid1 = new Cuboid();
        cuboid1.setHeight(sc.nextInt());


        System.out.println("Volume of the cuboid is: " + cuboid1.getLength()* rect.getBreadth()*cuboid1.getHeight());
    }
}
