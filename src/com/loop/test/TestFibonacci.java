package com.loop.test;

import org.testng.Assert;
import com.loop.main.Fibonacci;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Fibonacci class
 * @author Marisha
 *
 */

public class TestFibonacci {
    /**
     * This class contains all the test cases for testing Fibonacci class
     * @author Marisha
     *
     */
    @Test
    public void testFibPositive(){
        String methodOutput=Fibonacci.findFibonacci(10);
        String expectedOutput = "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]";
        Assert.assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public  void testFibzero(){
        String methodOutput=Fibonacci.findFibonacci(0);
        String expectedOutput = "0";
        Assert.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testFibOne(){
        String methodOutput=Fibonacci.findFibonacci(1);
        String expectedOutput = "1";
        Assert.assertEquals(expectedOutput,methodOutput);
    }

    @Test
    public void testFibNegetive(){
        String methodOutput=Fibonacci.findFibonacci(-2);
        String expectedOutput = "Cannot find fibonacci series of negetive number";
        Assert.assertEquals(expectedOutput,methodOutput);
    }
}
