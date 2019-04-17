package com.stringcomputation.test;

import com.stringcomputation.main.ReverseWord;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing ReverseWord class
 * @author Marisha
 *
 */
public class TestReverseWord {
    @Test
    public void reverse(){
        String str ="Happy Birthday";
        String methodOutput= ReverseWord.reverse(str);
        Assert.assertEquals(methodOutput,"yppaH yadhtriB");
    }

    @Test
    public void empty(){
        String str ="";
        String methodOutput=ReverseWord.reverse(str);
        Assert.assertEquals(methodOutput,"");
    }

    @Test
    public void specialCharacters(){
        String str ="Happy%&*";
        String methodOutput=ReverseWord.reverse(str);
        Assert.assertEquals(methodOutput,"*&%yppaH");
    }

    @Test
    public void testIntegersAndSpace(){
        String str ="Happy  10";
        String methodOutput=ReverseWord.reverse(str);
        Assert.assertEquals(methodOutput,"yppaH  01");
    }

    @Test
    public void testMultipleSpace(){
        String str ="Happy     Day";
        String methodOutput=ReverseWord.reverse(str);
        Assert.assertEquals(methodOutput,"yppaH     yaD");
    }

}
