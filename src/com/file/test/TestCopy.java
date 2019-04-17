package com.file.test;

import com.file.main.Copy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


/**
 * This class contains all the test cases for testing Copy class
 * @author Marisha
 */


public class TestCopy {
    @Test
    public void copySuccess() throws IOException{
        String path=System.getProperty("user.dir");
        String source=path+"\\src\\com\\file\\main\\UserInput.java";
        String dest=path+"\\src\\com\\file\\main\\UISample.txt";
        String methodOutput= Copy.copyFile(source,dest);
        Assert.assertEquals(methodOutput,"File Copied");
        File file=new File(dest);
        file.deleteOnExit();
    }

    @Test
    public void copyFailed() throws IOException{
        String path=System.getProperty("user.dir");
        String source=path+"src\\com\\file\\main\\Jist.java";
        String dest=path+"src\\com\\file\\main\\ListSample.txt";
        String methodOutput= Copy.copyFile(source,dest);
        Assert.assertEquals(methodOutput,"File does not exist");
    }

    @Test
    public void copyEmptyFIle() throws IOException {
        String pathsrc=System.getProperty("user.dir")+"\\src\\";
        File temp=File.createTempFile("hello",".txt",new File(pathsrc));
        temp.deleteOnExit();
        pathsrc=temp.getAbsolutePath();
        String pathdest=System.getProperty("user.dir")+"\\HelloSample.txt";
        File dest=new File(pathdest);
        dest.deleteOnExit();
        String methodOutput= Copy.copyFile(pathsrc,pathdest);
        Assert.assertEquals(methodOutput,"File Copied");
    }
}
