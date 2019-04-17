package com.stringcomputation.main;

import java.lang.reflect.Array;

/**
 *  *  Program which accepts a string like
 *  "This is nice" and converts it to a string like
 *  "This1 is2 nice3".
 */

public class AppendIntegerToSTring {
    public static String append(String input)
    {
        String[] strArray= input.split(" ");
        String temp="";
        int j=1;
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].equals(null) || strArray[i].equals(""))
            {
                temp=temp+" ";
            }else
            {
                temp = temp + strArray[i] + j + " ";
                j++;
            }
        }
        return temp.trim();

    }

    public static void main(String[] args) {
        String str="Hey hello how  are you?";
        String output=append(str);
        System.out.println(output);
    }
}
