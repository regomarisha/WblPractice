package com.file.test;


import com.file.main.CountWords;
import com.file.main.SearchString;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * This class contains all the test cases for testing SearchString class
 * @author Marisha
 *
 */
public class TestSearchString {
    @Test
    public void testValid() throws IOException {
        String file=System.getProperty("user.dir")+"\\src\\com\\file\\main\\List.java";
        int methodOutput= SearchString.search(file,"String");
        Assert.assertEquals(methodOutput,6);
    }

    @Test
    public void testInvalidFile() throws IOException {
        String file=System.getProperty("user.dir")+"\\sr.java";
        int methodOutput= SearchString.search(file,"String1");
        Assert.assertEquals(methodOutput,999,"Is not a file");
    }

    @Test
    public void testEmptyFile() throws IOException ,InterruptedException{
        String filepath=System.getProperty("user.dir")+"\\src\\";
        File temp=File.createTempFile("hello",".txt",new File(filepath));
        temp.deleteOnExit();
        filepath=temp.getAbsolutePath();
        System.out.println(filepath);
        int methodOutput= SearchString.search(filepath,"String");;
        Assert.assertEquals(methodOutput,0);
    }

}
