package com.stringcomputation.test;

import com.stringcomputation.main.Palindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Palindrome class
 * @author Marisha
 *
 */
public class TestPalindrome {
    @Test
    public void testValid(){
        String str="XOX";
        String methodOutput= Palindrome.isPalindrome(str);
        Assert.assertEquals(methodOutput,"Is a Palindrome");
    }

    @Test
    public void testInValid(){
        String str="XOXO";
        String methodOutput= Palindrome.isPalindrome(str);
        Assert.assertEquals(methodOutput,"Is not a Palindrome");
    }

    @Test
    public void testStrWithSpacesInvalid(){
        String str="XOXO XOXO";
        String methodOutput= Palindrome.isPalindrome(str);
        Assert.assertEquals(methodOutput,"Is not a Palindrome");
    }

    @Test
    public void testStrWithSpacesValid(){
        String str="XOX XOX";
        String methodOutput= Palindrome.isPalindrome(str);
        Assert.assertEquals(methodOutput,"Is a Palindrome");
    }

    @Test
    public void testSpCharacters(){
        String str="@@**))**@@";
        String methodOutput= Palindrome.isPalindrome(str);
        Assert.assertEquals(methodOutput,"Is a Palindrome");
    }
}
