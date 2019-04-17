package com.loop.main;

import java.util.Scanner;

/**
 * Write a program  that accepts input from the
 * command line and then prints them.
 */

public class UserInput {
    public static int print(int num){
        return num;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        System.out.println("Inputs is "+UserInput.print(input));
    }
}
