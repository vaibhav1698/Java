package com.company.vaibhav;

public class PracticeSetThree_2
{
    public static void main(String[] args)
    {
        String letter = "Dear <|name|>, Thanks a lot!";
        //we need to replace <|name> with our name
        letter = letter.replace("<|name|>", "Vaibhav");
        System.out.println(letter);
    }
}
