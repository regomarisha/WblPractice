package com.file.main;

import java.io.*;

/*
 * Program to search for a string in a file and then
 * replace it with another string.
 */
public class SearchReplace {
    public static String replace(String filepath,String find,String replace) throws FileNotFoundException,IOException{
       File file=new File(filepath);
       String line="",oldtext="";
        String newtext="";
        if(!file.isFile()) return "File does not exist";
        //Using Search string CLass to find if the string to be
        //replaced is present
        if(SearchString.search(filepath,find)>0) {
            BufferedReader buff = new BufferedReader(new FileReader(filepath));
            while ((line = buff.readLine()) != null) {
                oldtext += line + "\r\n";
                System.out.println(oldtext);
            }
            buff.close();
            String replacedText = oldtext.replaceAll(find, replace);
            FileWriter fwriter = new FileWriter(filepath);
            fwriter.write(replacedText);
            fwriter.close();
            return "File updated";
        }
        return "File does not contain word : "+find;
    }

    public static void main(String[] args) throws IOException,FileNotFoundException {
        String filepath="C:\\Users\\Marisha\\Desktop\\output1.txt";
        String find="theos";
        String replace="&&&";
        System.out.println(replace(filepath,find,replace));

    }
}
