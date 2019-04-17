package com.array.main;

/**
 * Program to find the missing number in a series
 * of sorted numbers stored in an array.
 *
 * an = a1 + (n – 1)d we use this to find the common difference
 */

public class FindMissing {
    public static String missing(int[] numbers){
        int temp,diff;
        int z=0;
        if(numbers[0]>numbers[1])return "Array should be in ascending order";
        diff=(numbers[numbers.length-1]-numbers[0])/(numbers.length);
        //(n – 1)== numbers.length
        // Because index starts from 0 and we already have one
        // missing number in our array
        for(int i=1;i<numbers.length;i++){
            temp=numbers[z]+diff;
            if(temp!=numbers[i]) {
                //validating
                if(((i+1) * diff) == temp ) return String.valueOf(temp);
                break;
            }
            z++;
        }
        return "Array is not sorted";
    }

    public static void main(String[] args) {
        int arr[]={2,5,3,6,7};
        String num=missing(arr);
        System.out.println(num);
    }
}
