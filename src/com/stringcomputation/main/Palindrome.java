package com.stringcomputation.main;

/**
 * Program to check for a palindrome string
 */
public class Palindrome {
    public static String isPalindrome(String str){
        String temp="";
        char[] chArray=str.toCharArray();
        for(int i=chArray.length-1;i>=0;i--){
            temp=temp+chArray[i];
        }
        if(temp.equals(str))return "Is a Palindrome";
        return "Is not a Palindrome";
    }

    public static void main(String[] args) {
        String input="XOXO XOXO";
        String output=isPalindrome(input);
        System.out.println(output);
    }
}
