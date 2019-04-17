package com.loop.test;

import com.loop.main.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Factorial class
 * @author Marisha
 *
 */
public class TestFactorial {
    @Test
    public void testFactorialPositive(){
        int output= Factorial.factorial(5);
        Assert.assertEquals(output,120);
    }

    @Test
    public void tesyFactorialNegetive(){
        int output= Factorial.factorial(-4);
        Assert.assertEquals(output,1);
    }

    @Test
    public  void testFactorialZero(){
        int output = Factorial.factorial(0);
        Assert.assertEquals(output,1);
    }

    @Test
    public void testFactorialRecursionPositive(){
        int output= Factorial.factorialRecursion(5);
        Assert.assertEquals(output,120);
    }

    @Test
    public void testFactorialRecursionNegetive(){
        int output= Factorial.factorialRecursion(-4);
        Assert.assertEquals(output,1);
    }

    @Test
    public  void testFactorialRecursionZero(){
        int output = Factorial.factorialRecursion(0);
        Assert.assertEquals(output,1);
    }

}
