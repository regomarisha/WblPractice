package com.loop.main;

import java.sql.Array;
import java.util.Arrays;

/**
 * Program  to check an armstrong number
 * i.e. Power up the each individual number to the total number of digits
 * and add them. Sum should be equal to the number itself.
 * For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
 * */

public class Armstrong {
    public static String checkIfArmstrong(int input)
    {
        int number=input;
        int temp;
        double arm=0;
        int power=String.valueOf(input).length();
        while (number>0){
            temp=number%10;
            number=number/10;
            arm=arm+Math.pow(temp,power);
            System.out.println(temp+" : "+number+" = "+arm);
        }
        if(input==(int)arm)return "Armstrong Number";
        else return "Not an Armstrong Number";

    }
    public static void main(String[] args) {
        String output=checkIfArmstrong(-153);
        System.out.println(output);
    }
}
