package com.company.vaibhav;

class Employee2
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

class cellPhone
{
    public void ringing()
    {
        System.out.println("Ringing");
    }
    public void vibrating()
    {
        System.out.println("Vibrating");
    }
    public void silence()
    {
        System.out.println("No response!");
    }
}

class square
{
    int side;


    public int perimeter()
    {
        return 4*side;
    }

    public int area()
    {
        return side*side;
    }
}
class rectangle
{
    int length;
    int breadth;


    public int perimeter()
    {
        return 2*(length+breadth);
    }

    public int area()
    {
        return length*breadth;
    }
}

class circle
{
    int radius;

    public double circumference()
    {
        return (Math.PI*2*radius);
    }
    public double area()
    {
        return (Math.PI*radius*radius);
    }
}

class viceCity
{
    public void hitting()
    {
        System.out.println("Can punch and kick!");
    }
    public void running()
    {
        System.out.println("Can run very fast!");
    }
    public void firing()
    {
        System.out.println("Can fire almost every gun!");
    }
    public void swimming()
    {
        System.out.println("Can't swim!");
    }
}
public class practiceSet8
{
    public static void main(String[] args)
    {
        Employee2 xyz = new Employee2();
        xyz.setName("xyz");
        System.out.println(xyz.getName());
        xyz.salary = 90000000;
        System.out.println(xyz.getSalary());


        cellPhone phone = new cellPhone();
        phone.ringing();
        phone.vibrating();
        phone.silence();

        square squareOne = new square();
        squareOne.side = 4;
        System.out.println("Perimeter of this Square: " + squareOne.perimeter());
        System.out.println("Area of this Square: " + squareOne.area());

        rectangle rectangleOne = new rectangle();
        rectangleOne.length = 4;
        rectangleOne.breadth = 5;
        System.out.println("Perimeter of this Rectangle: "+ rectangleOne.perimeter());
        System.out.println("Area of this Rectangle: "+ rectangleOne.area());

        viceCity tommyVercetti = new viceCity();
        System.out.println("Tommy Vercetti info: ");
        tommyVercetti.hitting();
        tommyVercetti.running();
        tommyVercetti.firing();
        tommyVercetti.swimming();

        circle circleOne = new circle();
        circleOne.radius = 10;
        System.out.println("Circumeference of this circle is: " + circleOne.circumference());
        System.out.println("Area of this circle is: " + circleOne.area());

    }
}

