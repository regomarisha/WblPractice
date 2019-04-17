package com.array.test;

import com.array.main.FindMissing;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing FindMissing class
 * @author Marisha
 *
 */

public class TestFindMissing {
    @Test
    public void testValid(){
        int[] arr={1,2,3,5,6};
        String methodOutput= FindMissing.missing(arr);
        Assert.assertEquals(methodOutput,"4");
    }


    @Test
    public void testValidDiffThree(){
        int[] arr={3,6,9,15};
        String methodOutput= FindMissing.missing(arr);
        Assert.assertEquals(methodOutput,"12");
    }

    @Test
    public void testValidDiffFour(){
        int[] arr={4,12,16,20};
        String methodOutput= FindMissing.missing(arr);
        Assert.assertEquals(methodOutput,"8");
    }

    @Test
    public void testInvalidSortedDescending(){
        int[] arr={9,8,7,6,4};
        String methodOutput= FindMissing.missing(arr);
        Assert.assertEquals(methodOutput,"Array should be in ascending order");
    }

    @Test
    public void testInvalidUnsorted(){
        int[] arr={2,5,3,6,7};
        String methodOutput= FindMissing.missing(arr);
        Assert.assertEquals(methodOutput,"Array is not sorted");
    }
}
