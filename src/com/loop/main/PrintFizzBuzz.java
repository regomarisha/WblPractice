package com.loop.main;
/** Write a program print "fizz" if a number is divisible by 3,
 * "buzz" if a number is divisible by 5,
 * and "fizz buzz" if number is divisible by both,
 * else print the number.
*/
public class PrintFizzBuzz {
    public static String fizzBuzz(int userInput){
        if((userInput%3==0) && (userInput%5==0))return "fizz buzz";
        else if(userInput%3==0)return "fizz";
        else if(userInput%5==0)return "buzz";
        else  return Integer.toString(userInput);
    }
    public static void main(String[] args) {
        int input=5;
        String ouput=fizzBuzz(input);
        System.out.println(ouput);

    }
}
