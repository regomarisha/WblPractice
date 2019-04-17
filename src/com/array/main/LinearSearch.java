package com.array.main;

/**
 * Class contains function to perform a linear search on any given array.
 * Linear search is the basic search where you look for the
 * element to be searched in a sequential way.
 *
 */
public class LinearSearch {
    public  static String linearSearch(int[] arr,int key){
        String str="";
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return "Key present in position "+(i+1);
            }
        }
        return "Key not present";
    }

    public static void main(String[] args) {

        int[] arr={4,2,6,8,9,3};
        int key=81;
        String str=linearSearch(arr,key);
        System.out.println(str);

    }
}
