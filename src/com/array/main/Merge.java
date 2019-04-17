package com.array.main;

/**
 * Program to merge 2 arrays.
 */
public class Merge {
    public static int[] mergeArray(int arr1[],int arr2[]){
        int lengthArray1=arr1.length;
        int lengthArray2=arr2.length;
        int size=lengthArray1+lengthArray2;
        int[] result=new int[size];
        for(int i=0;i< lengthArray1;i++){
            result[i]=arr1[i];
        }
        int j=0;
        for(int i=lengthArray1;i< size;i++){
            result[i]=arr2[j];
            j++;
        }
       return result;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] out=mergeArray(arr1,arr2);
       for(int i=0;i<out.length;i++){
            System.out.println(out[i]);

        }
    }

}
