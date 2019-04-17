package com.file.test;

import com.file.main.Copy;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


import static com.file.main.SearchReplace.replace;


/**
 * This class contains all the test cases for testing SearchReplace class
 * @author Marisha
 */

public class TestSearchReplace {
    public String fileB;
    @BeforeSuite
    public void generateTextFile() throws IOException {
        //This reuses code fromCopy.java and creates a text file which we can use in this text class
        String fileA=System.getProperty("user.dir")+"\\src\\com\\file\\main\\UserInput.java";
        fileB=System.getProperty("user.dir")+"\\src\\com\\file\\main\\sample.txt";
        Copy.copyFile(fileA,fileB);
        File file=new File(fileB);
        file.deleteOnExit();
    }

    @Test
    public void findReplacePresent() throws FileNotFoundException,IOException {
        String methodOutput=replace(fileB,"static","Statistic");
        Assert.assertEquals(methodOutput,"File updated");
    }

    @Test
    public void findReplaceNonExistingFile() throws FileNotFoundException, IOException{
        String methodOutput=replace("C:\\TFECG&.fish","junk","useful");
        Assert.assertEquals(methodOutput,"File does not exist");
    }

    @Test
    public void findReplaceIfPrsent() throws FileNotFoundException, IOException{
        String methodOutput=replace(fileB,"junk","Useful");
        Assert.assertEquals(methodOutput,"File does not contain word : junk");
    }




}
