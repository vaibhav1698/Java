package com.company.vaibhav;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class cylinder
{
    int radius;
    int height;

    public int getRadius()
    {
        return radius;
    }
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int r)
    {
        this.radius = r;
    }
    public void setHeight(int h)
    {
        this.height = h;
    }
}

public class practiceSet9_1
{
    public static void main(String[] args)
    {
        cylinder c = new cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder: ");
        c.setRadius(sc.nextInt());
        System.out.println("Enter height of the cylinder: ");
        c.setHeight(sc.nextInt());

        double volume = 0.00d;
        double surArea = 0.00d;

        volume = Math.PI * Math.pow(c.getRadius(), 2) * c.getHeight();
        surArea = (2 * Math.PI * c.getRadius() * c.getHeight()) + (2 * Math.PI * Math.pow(c.getRadius(),2));

        System.out.format("Volume of the cylinder is: %.2f \n", volume);
        System.out.format("Surface Area of the cylinder is: %.2f", surArea);
    }




}
