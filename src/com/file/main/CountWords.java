package com.file.main;
import java.io.*;

/**
 * Program to count the number of words in a file.
 */
public class CountWords {
    public static  int count (String filename) throws IOException {
        File file= new File(filename);
        if(!file.isFile()){
            System.out.println("Is not a file");
            return 999;
        }
        int word_count=0;
        String[] line;
        String buffline;
        BufferedReader buff=new BufferedReader(new FileReader(filename));
        while((buffline = buff.readLine())!=null){
            line=buffline.split(" ");
            for (String str:line) {
                if(!str.isEmpty())
                    word_count++;
            }
        }
        buff.close();
        return word_count;
    }

    public static void main(String[] args) throws  Exception {
        String file =System.getProperty("user.dir")+"\\src\\com\\file\\main\\";
        int c= count(file);
        System.out.println(c);
    }

}
