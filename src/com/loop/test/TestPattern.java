package com.loop.test;

import com.loop.main.Pattern;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Pattern class
 * @author Marisha
 *
 */
public class TestPattern {
    @Test
    public void testValid(){
        String methodOutput = Pattern.draw(3);
        Assert.assertEquals(methodOutput,"Success");
    }

    @Test
    public void testInvalid(){
        String methodOutput = Pattern.draw(-3);
        Assert.assertEquals(methodOutput,"Cannot draw pattern for numbers less than or equal to 0");
    }

    @Test
    public void testZero(){
        String methodOutput = Pattern.draw(0);
        Assert.assertEquals(methodOutput,"Cannot draw pattern for numbers less than or equal to 0");
    }
}
