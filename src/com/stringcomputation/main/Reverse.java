package com.stringcomputation.main;

/**
 * Program to reverse a string.
 * Donot use StringBuffer/StringBuilder inbuilt reverse function.
 */
public class Reverse {
    public  static String reverse(String str){
        int len=str.length();
        char[] strArray=str.toCharArray();
        char[] strNew=new char[len];
        String newString="";
        for(int i=len-1;i>=0;i--){
            newString=newString+strArray[i];
        }
        return newString;

    }
    public static void main(String[] args) {
        String str="Happy";
        String strRev=reverse(str);
        System.out.println(strRev);
    }
}
