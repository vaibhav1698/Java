package com.company.vaibhav;

class Employee
{
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);

    }

    public int getSalary()
    {
        return salary;
    }
}
public class learningClass
{
    public static void main(String[] args)
    {
        Employee Vaibhav = new Employee(); //Instantiating (creating) and object of the class Employee
        //object name is Vaibhav and it will have two attributes: id and name.
        Vaibhav.id = 69;
        Vaibhav.name = "Vaibhav Anand";
        Vaibhav.salary = 90000000;

        Vaibhav.printDetails();
        int salary = Vaibhav.getSalary();
        System.out.println(Vaibhav.name + "'s salary is: " + salary);


    }
}
