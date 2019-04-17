package com.array.test;

import com.array.main.SortArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortArray {
    @Test
    public void sortPositive(){
        int[] arr={3,2,5,1,7,3,0};
        int[] methodOutput= SortArray.sort(arr);
        Assert.assertEquals(methodOutput,new int[] {0,1,2,3,3,5,7});
    }

    @Test
    public void sortNegetive(){
        int[] arr={-3,-2,-5,-1,-7,-3,0};
        int[] methodOutput= SortArray.sort(arr);
        Assert.assertEquals(methodOutput,new int[] {-7,-5,-3,-3,-2,-1,0});
    }

    @Test
    public void sortNegetivePositive(){
        int[] arr={-3,-2,-5,0,5,3,2};
        int[] methodOutput= SortArray.sort(arr);
        Assert.assertEquals(methodOutput,new int[] {-5,-3,-2,0,2,3,5});
    }

}
