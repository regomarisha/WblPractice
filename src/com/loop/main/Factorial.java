package com.loop.main;

/**Program  to calculate factorial of a given number.
 * factorial function : Calculates the factorial without using recursion
 * factorialRecursion function : Calculates the factorial using recursion
 * factorial is defined only for non-negative integer numbers
 * */

public class Factorial {
    public static int factorial(int number){
        int factorial=1;
        if(number<=0) return  1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;

        }
        return factorial;
    }

    public  static int factorialRecursion(int number){
        if(number<=0) return  1;
        if(number==1)
            return 1;
        else return (number*factorial(number-1));
    }

    public static void main(String[] args) {
        int output=factorial(-4);
       // int output1=factorialRecursion(2);
        System.out.println(output);
    }
}
