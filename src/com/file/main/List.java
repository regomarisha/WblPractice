package com.file.main;

import java.io.File;

/*
  	Program to show list of all file names in a folder.
 */

public class List {
    public static String[] listFiles(String path){
        File fileObj=new File(path);
        String[] files={};
        if(fileObj.isDirectory()){
            System.out.println("Is Directory");
            files=fileObj.list();
            return files;
        }else
            System.out.println("Is not Directory");
            return  files;

    }
    public static void main(String[] args) {
        String filepath=System.getProperty("user.dir")+"\\src\\com\\file\\main";
        String[] arr=listFiles(filepath);
        for (String ar1:arr) {
            System.out.println(ar1);

        }
    }
}
