package com.loop.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.loop.main.PrintFizzBuzz.fizzBuzz;

/**
 * This class contains all the test cases for testing PrintFizzBuzz class
 * @author Marisha
 *
 */
public class TestPrintFizzBuzz {
    @Test
    public  void testFizz(){
        String methodOutput=fizzBuzz(9);
        Assert.assertEquals(methodOutput,"fizz");
    }

    @Test
    public  void testBuzz(){
        String methodOutput=fizzBuzz(10);
        Assert.assertEquals(methodOutput,"buzz");
    }

    @Test
    public void testFizzBuzz(){
        String methodOutput=fizzBuzz(15);
        Assert.assertEquals(methodOutput,"fizz buzz");
    }

    @Test
    public void testNoFizzBuzz(){
        String methodOutput=fizzBuzz(16);
        Assert.assertEquals(methodOutput,"16");
    }

    @Test
    public void testNegetive(){
        String methodOutput=fizzBuzz(-9);
        Assert.assertEquals(methodOutput,"fizz");
    }

}
