package com.array.test;

import com.array.main.LargestNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing LargestNumber class
 * @author Marisha
 *
 */
public class TestLargestNumber {
    @Test
    public void testPositiveNumbers()
    {
        int[] arr = {2,3,45,34,13};
        int actual = LargestNumber.largest(arr);
        Assert.assertEquals(actual,45);
    }

    @Test
    public void testNegativeNumbers()
    {
        int[] arr = {-2,-3,-45,-34,-13};
        int actual = LargestNumber.largest(arr);
        Assert.assertEquals(actual,-2);
    }

    @Test
    public void testDuplicateNumbers()
    {
        int[] arr = {2,3,45,34,2};
        int actual = LargestNumber.largest(arr);
        Assert.assertEquals(actual,45);
    }

    @Test
    public void testPosNegNumbers()
    {
        int[] arr = {-2,3,45,-34,13};
        int actual = LargestNumber.largest(arr);
        Assert.assertEquals(actual,45);
    }
}
