package com.loop.test;

import com.loop.main.UserInput;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing UserInput class
 * Could not figure out how to pass command line args in TESTNG
 * * @author Marisha
 *
 */

public class TestUserInput{
    @Test
    public void testPositive(){
       Assert.assertEquals(UserInput.print(1), 1);
    }

    @Test
    public void testNegetive(){
        Assert.assertEquals(UserInput.print(-4),-4 );
    }

    @Test
    public void testZero(){
        Assert.assertEquals(UserInput.print(0),0 );
    }

}