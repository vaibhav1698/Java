package com.company.vaibhav;

public class varArgs
{
    static int sum(int ... arr)
    {
        int result=0;

        for(int i = 0; i<arr.length; i++)
        {
            result +=arr[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(sum(2,3,4,5,6,8));
    }
}
