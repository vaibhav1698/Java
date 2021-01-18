package com.company.vaibhav;

class Cylinder2
{
    int height;
    int radius;

    Cylinder2()
    {
        this.radius = 10;
        this.height = 50;
    }

    public Cylinder2(int height, int radius)
    {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight()
    {
        return height;
    }

    public int getRadius()
    {
        return radius;
    }
}
public class practiceSet9_2
{
    public static void main(String[] args)
    {
        Cylinder2 c1 = new Cylinder2();

        double volume;
        double surArea;

        volume = Math.PI * Math.pow(c1.getRadius(), 2) * c1.getHeight();
        surArea = (2 * Math.PI * c1.getRadius() * c1.getHeight()) + (2 * Math.PI * Math.pow(c1.getRadius(),2));
        System.out.format("Volume of the default cylinder is: %.2f", volume);
        System.out.println();
        System.out.format("Surface Area of the default cylinder is: %.2f", surArea);
        System.out.println();


        Cylinder2 c2 = new Cylinder2(12, 60);
        volume = Math.PI * Math.pow(c2.getRadius(), 2) * c2.getHeight();
        surArea = (2 * Math.PI * c2.getRadius() * c2.getHeight()) + (2 * Math.PI * Math.pow(c2.getRadius(),2));

        System.out.format("Volume of the parameterised cylinder is: %.2f", volume);
        System.out.println();
        System.out.format("Surface Area of the parameterised cylinder is: %.2f", surArea);
        System.out.println();

    }
}
