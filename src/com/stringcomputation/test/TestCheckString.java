package com.stringcomputation.test;

import com.stringcomputation.main.CheckString;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing CheckString class
 * @author Marisha
 *
 */
public class TestCheckString {
    @Test
    public void testValid(){
        boolean methodOutput= CheckString.check("(())");
        Assert.assertEquals(methodOutput,true);
    }

    @Test
    public void testInvalid(){
        boolean methodOutput= CheckString.check("(()))");
        Assert.assertEquals(methodOutput,false);
    }

    @Test
    public void testEmpty(){
        boolean methodOutput= CheckString.check("");
        Assert.assertEquals(methodOutput,true);
    }

    @Test
    public void testWithLetters(){
        boolean methodOutput= CheckString.check("{ a[ (b ) ]c }");
        Assert.assertEquals(methodOutput,true);
    }

    @Test
    public void testWithDigits(){
        boolean methodOutput= CheckString.check("{(1*2)(3*4)}");
        Assert.assertEquals(methodOutput,true);
    }

}
