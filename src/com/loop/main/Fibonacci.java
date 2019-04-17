package com.loop.main;

import java.util.Arrays;

/**
 * Program to print fibonacci series
 * i.e..0 1 1 2 3 5 8.
 * You can vary the number of elements to be printed
 * meaning you can print 10 numbers or 15 or 20 or any desired number.
 */

public class Fibonacci {
    public  static String findFibonacci(int input){
        int[] arr;
        if (input < 0) return "Cannot find fibonacci series of negetive number";
        else if (input==0)return "0";
        else if(input==1) return "1";
        arr = new int[input];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<input;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        String fib= Arrays.toString(arr);
        return fib;
    }
    public static void main(String[] args) {
        String fib=findFibonacci(5);
        System.out.println(fib);
    }
}
