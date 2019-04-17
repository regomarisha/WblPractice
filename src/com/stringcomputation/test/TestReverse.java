package com.stringcomputation.test;

import com.stringcomputation.main.Reverse;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Reverse class
 * @author Marisha
 *
 */
public class TestReverse {
    @Test
    public void reverse(){
        String str ="Happy Birthday";
        String methodOutput= Reverse.reverse(str);
        Assert.assertEquals(methodOutput,"yadhtriB yppaH");
    }

    @Test
    public void empty(){
        String str ="";
        String methodOutput=Reverse.reverse(str);
        Assert.assertEquals(methodOutput,"");
    }

    @Test
    public void specialCharacters(){
        String str ="Happy%&*";
        String methodOutput=Reverse.reverse(str);
        Assert.assertEquals(methodOutput,"*&%yppaH");
    }

    @Test
    public void testIntegersAndSpace(){
        String str ="Happy  10";
        String methodOutput=Reverse.reverse(str);
        Assert.assertEquals(methodOutput,"01  yppaH");
    }
}

