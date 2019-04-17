package com.collections.main;


import java.util.HashSet;
import java.util.Set;

/*
  	Program to find duplicates in an array using set.

 */
public class FindDuplicate {
    public static String findDuplicate(int[] arr){
        Set<Integer> set=new HashSet<Integer>();
        String dup="";
        for(int i=0;i<arr.length;i++){
            if(set.add(arr[i])==false){
                System.out.println("Duplicate "+arr[i]+" found at index location "+i);
                dup=dup+arr[i]+" ";
            }
        }
        if(dup.equals("")) return "No Duplicates";
    return dup;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,3,-4 ,3,0,-2};
        System.out.println(findDuplicate(arr));

    }
}
