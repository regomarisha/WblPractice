package com.loop.main;

/**
 * Program  to check if a given number is prime or not.
 */
public class Prime {
    public static String checkIfPrime(int userinput){
        if(userinput<=1) return "Not Prime";
        boolean check = false;
        for(int i = 2; i <= userinput/2; ++i)
        {
            if(userinput % i == 0) {
                {
                    check = true;
                    break;
                }
            }
        }
        if (check==false) {
            return "Prime";
        }
        else {
            return "Not Prime";
        }
    }
    public static void main(String[] args) {
       String output=checkIfPrime(17);
        System.out.println(output);
    }
}
