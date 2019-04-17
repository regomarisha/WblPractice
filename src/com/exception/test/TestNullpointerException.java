package com.exception.test;

import com.exception.main.NullpointerException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing NullpointerException class
 * @author Marisha
 *
 */

public class TestNullpointerException {
    @Test
    public void testValidInput(){
        int[] arr={1,2};
        NullpointerException np=new NullpointerException();
        Assert.assertEquals(np.getArrayLength(arr),"2","Finally Block Executed");
    }
    @Test
    public void testInvalidnput(){
        int[] arr=null;
        NullpointerException np=new NullpointerException();
        Assert.assertEquals(np.getArrayLength(arr),"Array doesnt have elements","Finally Block Executed");
    }
}
