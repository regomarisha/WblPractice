package com.file.test;

import com.file.main.List;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * This class contains all the test cases for testing List class
 * @author Marisha
 *
 */
public class TestList {
    @Test
    public void testDir(){
        String filepath=System.getProperty("user.dir")+"\\src\\com\\file\\main";
        String[] expectedOutput={"Copy.java","CountWords.java","List.java","SearchReplace.java","SearchString.java","UserInput.java"};
        String[] methodOutput= List.listFiles(filepath);
        Assert.assertEquals(methodOutput,expectedOutput,"Is Directory");
    }

    @Test
    public void testNotDir(){
        String filepath=System.getProperty("user.dir")+"\\src1";
        String[] expectedOutput={};
        String[] methodOutput= List.listFiles(filepath);
        Assert.assertEquals(methodOutput,expectedOutput,"Is not Directory");
    }
}
