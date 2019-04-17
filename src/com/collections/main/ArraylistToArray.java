package com.collections.main;

import java.util.ArrayList;
import java.util.Arrays;

/*
*Program to copy arraylist to an array.
*/
public class ArraylistToArray {
    public static Integer[] convert(ArrayList<Integer> arrList)
    {
        Integer arr[] = {};
        if(arrList.isEmpty()){
            System.out.println("ArrayList is Empty");
            return arr;
        }
        arr=new Integer[arrList.size()];
        int count=0;
        for (Integer i : arrList) {
            arr[count]=i;
            count++;
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> code = new ArrayList<Integer>(Arrays.asList(1,2,34,5,6));
        Integer[] array=convert(code);
        for (int content:array) {
            System.out.println(content);
        }
    }
}
