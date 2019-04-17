package com.loop.test;

import com.loop.main.Prime;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Prime class
 * @author Marisha
 *
 */
public class TestPrime {
    @Test
    public void testPrime(){
        String methodOutput= Prime.checkIfPrime(13);
        Assert.assertEquals(methodOutput,"Prime");
    }

    @Test
    public void testNonPrime(){
        String methodOutput=Prime.checkIfPrime(6);
        Assert.assertEquals(methodOutput,"Not Prime");
    }

    @Test
    public void testTwo(){
        String methodOutput=Prime.checkIfPrime(2);
        Assert.assertEquals(methodOutput,"Prime");
    }

    @Test
    public void testThree(){
        String methodOutput=Prime.checkIfPrime(3);
        Assert.assertEquals(methodOutput,"Prime");
    }

    @Test
    public void testOne(){
        String methodOutput=Prime.checkIfPrime(1);
        Assert.assertEquals(methodOutput,"Not Prime");
    }

    @Test
    public  void testZero(){
        String methodOutput=Prime.checkIfPrime(0);
        Assert.assertEquals(methodOutput,"Not Prime");
    }

    @Test
    public void testNegetive(){
        String methodOutput=Prime.checkIfPrime(-4);
        Assert.assertEquals(methodOutput,"Not Prime");
    }
}
