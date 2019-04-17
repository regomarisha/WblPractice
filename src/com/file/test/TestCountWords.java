package com.file.test;

import com.file.main.CountWords;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;

/**
 * This class contains all the test cases for testing List class
 * @author Marisha
 */
public class TestCountWords {

    @Test
    public void testValid() throws IOException {
        String file=System.getProperty("user.dir")+"\\src\\com\\file\\main\\Copy.java";
        int methodOutput= CountWords.count(file);
        Assert.assertEquals(methodOutput,73);
    }

    @Test
    public void testInvalidFile() throws IOException {
        String file=System.getProperty("user.dir")+"\\sr.java";
        int methodOutput= CountWords.count(file);
        Assert.assertEquals(methodOutput,999,"Is not a file");
    }

    @Test
    public void testEmptyFile() throws IOException ,InterruptedException{
        String filepath=System.getProperty("user.dir")+"\\src\\";
        File temp=File.createTempFile("hello",".txt",new File(filepath));
        temp.deleteOnExit();
        filepath=temp.getAbsolutePath();
        System.out.println(filepath);
        int methodOutput= CountWords.count(filepath);
        Assert.assertEquals(methodOutput,0);
    }
}
