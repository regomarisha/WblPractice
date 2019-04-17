package com.stringcomputation.main;

/**
 *  Write a program to find a substring in a given
 *  string and then replace it with another string
 */
public class FIndAndReplace {

    public static String searchReplace(String str,String sub,String newString){
        String replaced = str.replace(sub, newString);
        return replaced;
    }

    public static void main(String[] args) {
        String str="Hello there . How are you?";
        String sub="there";
        String newSub="Marisha";
        String replaced=searchReplace(str,sub,newSub);
        System.out.println(replaced);
    }
}
