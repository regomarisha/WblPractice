package com.loop.main;

/** Program that swaps 2 given numbers.
  --> swap Function :  Swaps the numbers without any third new variable.
  --> swapWithVariable function : Swaps the numbers using a third variable.
*/

public class SwapNumbers {
    public static String  swap(int first,int second){
        first=first-second;
        second=first+second;
        first=second-first;
        return first+":"+second;
    }

    public static void main(String[] args) {
        int one=4,two=1;
        String output=swap(one,two);
    }
    public static String  swapWithVariable(int first,int second){
        int temp=first;
        first=second;
        second=temp;
        return first+":"+second;
    }
}
