package com.array.main;


/***Incomplete
/**
 *  Program to locate and swap only 2 elements which are not sorted in a given sorted array.
 *  For example given an array {1,2,5,6,4} locate 5 and 4
 *  and then swap them as they are not as per sorted order.
 */
public class Swap {
    public static int[] swapNumbers(int[] arr){
        for (int i = arr.length-1; i > 0; i--)
        {
            if (arr[i] < arr[i - 1])
            {
                int j = i - 1;
                while (j >= 0 && arr[i] < arr[j])
                    j--;
                int temp = arr[i];
                arr[i] = arr[j + 1];
                arr[j + 1] = temp;
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int arr[]={1,2,5,4,3};
        int[] arrResult=swapNumbers(arr);
        for(int i=0;i<arrResult.length;i++) {
            System.out.println(arrResult[i]);
        }
    }
}
