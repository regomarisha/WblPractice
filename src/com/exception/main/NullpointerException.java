package com.exception.main;

/*
* Program that is expected to throw a null pointer com.exception
* and in turn handles it using try catch and finally.
*
 */
public class NullpointerException {
    public  String getArrayLength(int[] arr){
        try
        {
            return Integer.toString(arr.length);
        }catch (NullPointerException e){
            return "Array doesnt have elements";
        }finally {
            System.out.println("Finally Block Executed");
        }
    }
}
