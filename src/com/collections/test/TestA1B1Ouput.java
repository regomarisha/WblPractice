package com.collections.test;

import com.collections.main.A1B1Ouput;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class contains all the test cases for testing A1B1Output class
 * @author Marisha
 *
 */
public class TestA1B1Ouput {
    @Test
    public void testEvenArray(){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList(1, 6, 2, 7, 3, 8, 4, 9, 5, 10) );
        Assert.assertEquals(methodOutput,out);
    }

    @Test
    public void testOddArray(){
        int a[]={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList(1, 5, 2, 6, 3, 7, 4, 8, 9) );
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        Assert.assertEquals(methodOutput,out);
    }

    @Test
    public void testPosNegArray(){
        int a[]={1,2,3,4,5,-6,-7,-8,-9,-10};
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList(1, -6, 2, -7, 3, -8, 4, -9, 5, -10) );
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        Assert.assertEquals(methodOutput,out);
    }

    @Test
    public void testArrayZero(){
        int a[]={};
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList() );
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        Assert.assertEquals(methodOutput,out);
    }

    @Test
    public void testArrayOne(){
        int a[]={3};
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList(3) );
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        Assert.assertEquals(methodOutput,out);
    }

    @Test
    public void testArrayTwo(){
        int a[]={1,3};
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList(1,3) );
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        Assert.assertEquals(methodOutput,out);
    }

    @Test
    public void testArrayThree(){
        int a[]={1,3,2};
        ArrayList<Integer> out = new ArrayList<Integer>( Arrays.asList(1,3,2) );
        ArrayList<Integer> methodOutput= A1B1Ouput.swap(a);
        Assert.assertEquals(methodOutput,out);
    }

}
