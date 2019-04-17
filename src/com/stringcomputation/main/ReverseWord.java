package com.stringcomputation.main;

/**
 * Program to reverse each individual word in a sentence.
 */
public class ReverseWord {
    public static String reverse(String str){
        String[] strArray=str.split(" ");
        String temp="";
        for(int i=0;i<strArray.length;i++){
            String tempWord="";
            if(strArray[i].equals(null) || strArray[i].equals(""))
            {
                temp=temp+"";
            }
           else
            {
                char[] word=strArray[i].toCharArray();
                for(int j=word.length-1;j>=0;j--)
                {
                    tempWord=tempWord+word[j];
                    //System.out.println(tempWord);
                }
            }
            temp=temp+tempWord+" ";
        }
        return  temp.trim();
    }
    public static void main(String[] args) {
        String input="Hello world";
        String reverse=reverse(input);
        System.out.println(reverse);
    }
}
