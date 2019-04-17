package com.collections.test;

import com.collections.main.FindDuplicate;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing FindDuplicate class
 * @author Marisha
 *
 */
public class TestFindDuplicate {
    @Test
    public void testDuplicates(){
        int[] arr1={1,2,3,4,1,2,4};
        String methodOutput= FindDuplicate.findDuplicate(arr1);
        Assert.assertEquals(methodOutput,"1 2 4 " );
    }

    @Test
    public void testNegetive(){
        int[] arr1={-1,-2,-3,-4 ,-2, -4};
        String methodOutput= FindDuplicate.findDuplicate(arr1);
        Assert.assertEquals(methodOutput,"-2 -4 ");
    }

    @Test
    public void testPositiveNegetive(){
        int[] arr1={1,-2,3,-4 ,3,0,-2};
        String methodOutput= FindDuplicate.findDuplicate(arr1);
        Assert.assertEquals(methodOutput,"3 -2 ");
    }

    @Test
    public void testNoDuplicate(){
        int[] arr1={1,2,3,4};
        String methodOutput= FindDuplicate.findDuplicate(arr1);
        Assert.assertEquals(methodOutput,"No Duplicates");
    }

}
