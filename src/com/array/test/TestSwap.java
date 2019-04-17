package com.array.test;

import com.array.main.Swap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Swap class
 * @author Marisha
 *
 */

public class TestSwap {
    @Test
    public void sortPositive(){
        int[] arr={0,3,2,1,5,7};
        int[] methodOutput= Swap.swapNumbers(arr);
        Assert.assertEquals(methodOutput,new int[] {0,1,2,3,5,7});
    }

    @Test
    public void sortNegetive(){
        int[] arr={-7,-5,-1,-2,-3};
        int[] methodOutput= Swap.swapNumbers(arr);
        Assert.assertEquals(methodOutput,new int[] {-7,-5,-3,-2,-1});
    }

    @Test
    public void sortNegetivePositive(){
        int[] arr={-3,-2,0,5,3,2};
        int[] methodOutput= Swap.swapNumbers(arr);
        Assert.assertEquals(methodOutput,new int[] {-3,-2,0,2,3,5});
    }
}
