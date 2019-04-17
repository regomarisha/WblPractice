package com.file.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *  Program to copy content of file into another file.
 */

public class Copy {
    public static String copyFile(String filesrc,String filedest) throws IOException {
        File sourcefile=new File(filesrc);
        File destfile=new File(filedest);
        if(!sourcefile.isFile()) return "File does not exist";
        Files.copy(sourcefile.toPath(),destfile.toPath());
        if(destfile.exists()) return  "File Copied";
        return  "Error in copying";
    }
    public static void main(String[] args)  throws IOException{
        String fileA=System.getProperty("user.dir")+"\\src\\com\\file\\main\\UserInput.java";
        String fileB=System.getProperty("user.dir")+"\\src\\com\\file\\main\\sample.txt";
        System.out.println(copyFile(fileA,fileB));
        File filetemp=new File(fileB);
        filetemp.deleteOnExit();
    }
}