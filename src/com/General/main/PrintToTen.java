package com.General.main;

/**
 * Program to print 1 to 10 numbers without using
 * loops and you should not have more than 1 print statement.
 * No test class added for this method
 */
public class PrintToTen {
    public static void print(int n)
    {
        if(n<=10){
            System.out.println(n);
            print(n+1);
        };

    }

    public static void main(String[] args) {
        print(1);
    }
}

