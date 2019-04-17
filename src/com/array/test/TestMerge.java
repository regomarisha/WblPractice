package com.array.test;

import com.array.main.Merge;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Merge class
 * @author Marisha
 *
 */
public class TestMerge {
    @Test
    public void mergeEqualLength(){
        int[] arr1={1,2,3,4};
        int[] arr2={5,4,3,2};
        int[] expectedOutput={1,2,3,4,5,4,3,2};
        int[] methodOutput= Merge.mergeArray(arr1,arr2);
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void mergeUnequalLength(){
        int[] arr1={1,2,3,4,5};
        int[] arr2={5,4};
        int[] expectedOutput={1,2,3,4,5,5,4};
        int[] methodOutput= Merge.mergeArray(arr1,arr2);
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void mergeNegetive(){
        int[] arr1={-1,-6,-3};
        int[] arr2={-5,-4};
        int[] expectedOutput={-1,-6,-3,-5,-4};
        int[] methodOutput= Merge.mergeArray(arr1,arr2);
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void mergeWithEmptyArray(){
        int[] arr1={1,2,3,4};
        int[] arr2=new int[0];
        int[] expectedOutput={1,2,3,4};
        int[] methodOutput= Merge.mergeArray(arr1,arr2);
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void mergeDuplicate(){
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        int[] expectedOutput={1,2,3,4,1,2,3,4};
        int[] methodOutput= Merge.mergeArray(arr1,arr2);
        Assert.assertEquals(methodOutput,expectedOutput);
    }

}
