package com.array.test;

import com.array.main.LinearSearch;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing LinearSearch class
 * @author Marisha
 *
 */
public class TestLinearSearch {
    @Test
    public void keyPresent(){
        int[] arr={3,4,6,8,10};
        int key=6;
        String methodOutput= LinearSearch.linearSearch(arr,key);
        Assert.assertEquals(methodOutput,"Key present in position 3");
    }

    @Test
    public void keyNotPresent(){
        int[] arr={3,4,9,8,10};
        int key=6;
        String methodOutput= LinearSearch.linearSearch(arr,key);
        Assert.assertEquals(methodOutput,"Key not present");
    }

    @Test
    public void arrayIsAscending(){
        int[] arr={3,4,5,8,10};
        int key=10;
        String methodOutput= LinearSearch.linearSearch(arr,key);
        Assert.assertEquals(methodOutput,"Key present in position 5");
    }


    @Test
    public void arrayIsDescending(){
        int[] arr={9,5,4,2,1};
        int key=9;
        String methodOutput= LinearSearch.linearSearch(arr,key);
        Assert.assertEquals(methodOutput,"Key present in position 1");
    }


    @Test
    public void testNegetive(){
        int[] arr={3,4,5,8,10};
        int key=-10;
        String methodOutput= LinearSearch.linearSearch(arr,key);
        Assert.assertEquals(methodOutput,"Key not present");
    }





}
