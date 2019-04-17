package com.array.main;

/**
 *  Program to find the largest number in a given array.
 */

public class LargestNumber {

    public static int largest(int[] array){
        int largest=array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]>largest)  {
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={0,3,5,9,10,3,0};
        int num=largest(arr);
        System.out.println(num);

    }
}
