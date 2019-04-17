package com.file.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *  Program to search for a string in a file and
 *  then return the count of number of occurrences of the string.
 */

public class SearchString {
    public static int search(String filepath,String sub ) throws IOException{
        File file= new File(filepath);
        if(!file.isFile()){
            System.out.println("Is not a file");
            return 999;
        }
        BufferedReader buff=new BufferedReader(new FileReader(filepath));
        String buffLine;
        int count=0;
        while((buffLine=buff.readLine())!=null){
            if(buffLine.contains(sub)){
                count++;
            }
        }
        buff.close();
        return count;
    }
    public static void main(String[] args) throws IOException {
        String filepath="C:\\Users\\Marisha\\Desktop\\output1.txt";
        String str="the";
        int count=search(filepath,str);
        System.out.println("Count : "+count);
    }
}
