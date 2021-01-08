package com.company.vaibhav;

public class StringsPractice
{
    public static void main(String[] args)
    {
        System.out.print("The name is: ");
        String name = new String("Vaibhav");
        System.out.println(name);

        int a = 6;
        float b = 5.69f;

        System.out.printf("The value of a is %d and value of b is %f \n", a,b);
        System.out.format("The value of a is %d and value of b is %f \n", a,b);
        System.out.printf("%.2f \n", b);
        System.out.printf("%s", name);

    }
}
