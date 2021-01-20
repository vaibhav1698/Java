package com.company.vaibhav;

import java.util.Scanner;

class Animal
{
    String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void speak()
    {
        System.out.println("I can speak in my own language!");
    }
    public void walk()
    {
        System.out.println("I can walk!");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("I can Bark!");
    }
    public void run()
    {
        System.out.println("I can also run!");
    }
}
public class inheritance2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dog myDog = new Dog();
        System.out.println("Enter your Dog's name: ");
        myDog.setName(sc.nextLine());
        System.out.println("Hello, I am a Dog and my name is " + myDog.getName());
        myDog.speak();
        myDog.bark();
        myDog.walk();
        myDog.run();
    }
}
