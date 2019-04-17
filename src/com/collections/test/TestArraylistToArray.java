package com.collections.test;

import com.collections.main.ArraylistToArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class contains all the test cases for testing ArraylisToArray class
 * @author Marisha
 *
 */
public class TestArraylistToArray {
    @Test
    public void testValid(){
        ArrayList<Integer> code = new ArrayList<>(Arrays.asList(4,2,3,1));
        Integer[] methodOutput= ArraylistToArray.convert(code);
        Integer[] expectedOutput={4,2,3,1};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void testEmpty(){
        ArrayList<Integer> code = new ArrayList<>(Arrays.asList());
        Integer[] methodOutput= ArraylistToArray.convert(code);
        Integer[] expectedOutput={};
        Assert.assertEquals(methodOutput,expectedOutput,"ArrayList is Empty");
    }

    @Test
    public void testNegetive(){
        ArrayList<Integer> code = new ArrayList<>(Arrays.asList(-1,-3,-4));
        Integer[] methodOutput= ArraylistToArray.convert(code);
        Integer[] expectedOutput={-1,-3,-4};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void testNegetivePositive(){
        ArrayList<Integer> code = new ArrayList<>(Arrays.asList(-1,-3,-4,0,1,2));
        Integer[] methodOutput= ArraylistToArray.convert(code);
        Integer[] expectedOutput={-1,-3,-4,0,1,2};
        Assert.assertEquals(methodOutput,expectedOutput);
    }
}
