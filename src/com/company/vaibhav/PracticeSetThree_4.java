package com.company.vaibhav;

public class PracticeSetThree_4
{
    public static void main(String[] args)
    {
        String letter = "Dear Vaibhav, How are you? I hope you're fine";
        // format this string using escape sequences as they would appear in a letter format
        System.out.println("Original String: " + letter);
        letter = "Dear Vaibhav,\n\t\t\tHow are you?\n\t\t\tI hope you're fine";
        System.out.println("Formatted String:\n" + letter);
    }
}
