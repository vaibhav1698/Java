package com.company.vaibhav;

import java.util.Scanner;

public class PracticeSetThree_1
{
    public static void main(String[] args)
    {
        String spacedString;
        spacedString = "My Name is Vaibhav Anand";

        String underscoredString;

        underscoredString = spacedString.replace(" ","_");

        System.out.println("Original String: " + spacedString);
        System.out.println("New String: " + underscoredString);

    }
}
