package com.company.vaibhav;

public class PractiseSetTwo_1
{
    public static void main(String[] args)
    {
        //encrypting a grade by adding 8 to it and then decrypting it
        char grade = 'B';
        grade = (char)(grade + 8);
        //type-casting it to char since char + int gives int
        System.out.println(grade);

        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
