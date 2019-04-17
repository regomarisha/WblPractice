package com.array.test;

import com.array.main.Common;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Common class
 * @author Marisha
 *
 */


public class TestCommon {
    @Test
    public void testCommon(){
        int[] arr1={1,2,3,4};
        int[] arr2={2,4,5,6};
        String methodOutput= Common.findCommon(arr1,arr2);
        Assert.assertEquals(methodOutput," 2 4");
    }

    @Test
    public void testDuplicates(){
        int[] arr1={1,2,3,4,1};
        int[] arr2={2,4,5,6,2,1};
        String methodOutput= Common.findCommon(arr1,arr2);
        Assert.assertEquals(methodOutput," 1 2 4");
    }

    @Test
    public void testNegetive(){
        int[] arr1={-1,-2,-3,-4};
        int[] arr2={-2,-4,-5,-6};
        String methodOutput= Common.findCommon(arr1,arr2);
        Assert.assertEquals(methodOutput," -2 -4");
    }

    @Test
    public void testPositiveNegetive(){
        int[] arr1={1,-2,3,-4};
        int[] arr2={-2,4,5,6};
        String methodOutput= Common.findCommon(arr1,arr2);
        Assert.assertEquals(methodOutput," -2");
    }

    @Test
    public void testNoCommon(){
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        String methodOutput= Common.findCommon(arr1,arr2);
        Assert.assertEquals(methodOutput,"");
    }


}

