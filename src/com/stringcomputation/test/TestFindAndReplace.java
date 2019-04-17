package com.stringcomputation.test;

import com.stringcomputation.main.FIndAndReplace;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing FindAndReplace class
 * @author Marisha
 *
 */
public class TestFindAndReplace {
    @Test
    public void replace(){
        String str="Hello it is raining";
        String find="Hello";
        String replace="Hey";
        String methodOutput= FIndAndReplace.searchReplace(str, find, replace);
        Assert.assertEquals(methodOutput,"Hey it is raining");
    }

    @Test
    public void replaceMultiple(){
        String str="This is my test.This is used to test FIndAndReplace";
        String find="This";
        String replace="It";
        String methodOutput= FIndAndReplace.searchReplace(str, find, replace);
        Assert.assertEquals(methodOutput,"It is my test.It is used to test FIndAndReplace");
    }

    @Test
    public void replaceCharacters(){
        String str="Heiio Worid";
        String find="i";
        String replace="l";
        String methodOutput= FIndAndReplace.searchReplace(str, find, replace);
        Assert.assertEquals(methodOutput,"Hello World");
    }

    @Test
    public void replaceSpecialChar(){
        String str="Hello     World";
        String find=" ";
        String replace="*";
        String methodOutput= FIndAndReplace.searchReplace(str, find, replace);
        Assert.assertEquals(methodOutput,"Hello*****World");
    }

    @Test
    public void replaceNumbers(){
        String str="Hi Five";
        String find="Five";
        String replace="5";
        String methodOutput= FIndAndReplace.searchReplace(str, find, replace);
        Assert.assertEquals(methodOutput,"Hi 5");
    }




}
