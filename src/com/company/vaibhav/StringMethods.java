package com.company.vaibhav;

public class StringMethods
{
    public static void main(String[] args)
    {
        String name = "Vaibhav";
        System.out.println(name);
        int value = name.length();
        System.out.println("Length of name is: " + value);

        String lowerString = name.toLowerCase();
        System.out.println(lowerString);

        String upperString = name.toUpperCase();
        System.out.println(upperString);

        String name1 = "   Vaibhav Anand   ";
        System.out.println(name1);

        String trimmedString = name1.trim();
        System.out.println(trimmedString);

        String subStringFromStart;

        subStringFromStart = name.substring(2);
        System.out.println(subStringFromStart);

        String subString;

        subString = trimmedString.substring(2, 6);
        System.out.println(subString);

        String replacedString;

        replacedString = trimmedString.replace('a', 'b');
        System.out.println(replacedString);
        System.out.println(name1.replace('a', 'b'));
        System.out.println(trimmedString.replace("aib", "bia"));
        System.out.println(trimmedString.replace("a", "aaaa"));

        System.out.println(trimmedString.startsWith("Va"));
        System.out.println(trimmedString.endsWith("nd"));

        System.out.println(trimmedString.charAt(4));

        System.out.println(trimmedString.indexOf("ib"));
        System.out.println(trimmedString.indexOf("h",2));

        System.out.println(trimmedString.lastIndexOf("a",2));
        System.out.println(trimmedString.lastIndexOf("a"));

        System.out.println(trimmedString.equals("Vaibhav Anand"));
        System.out.println(trimmedString.equalsIgnoreCase("vaibhaV aNand"));

        System.out.println("Escape Sequence: ");
        System.out.println("This is how double quotes \" are printed");
        System.out.println("This is how single quotes \' are printed");
        System.out.println("This is how backslash \\ are printed");


    }
}
