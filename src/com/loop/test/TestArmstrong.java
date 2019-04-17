package com.loop.test;

import com.loop.main.Armstrong;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * This class contains all the test cases for testing Armstrong class
 * @author Marisha
 *
 */
public class TestArmstrong {
    @Test
    public void testValid(){
        String methodOutput= Armstrong.checkIfArmstrong(153);
        Assert.assertEquals(methodOutput,"Armstrong Number");
    }

    @Test
    public void testInvalid(){
        String methodOutput=Armstrong.checkIfArmstrong(321);
        Assert.assertEquals(methodOutput,"Not an Armstrong Number");
    }

    @Test
    public void testZero(){
        String methodOutput=Armstrong.checkIfArmstrong(0);
        Assert.assertEquals(methodOutput,"Armstrong Number");
    }

    @Test
    public void testNegetive(){
        String methodOutput=Armstrong.checkIfArmstrong(-153);
        Assert.assertEquals(methodOutput,"Not an Armstrong Number");
    }

}
