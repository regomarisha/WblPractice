package com.collections.test;

import com.collections.main.ArraylistMethods;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class contains all the test cases for testing ArraylistMethods class
 * @author Marisha
 *
 */

public class TestArraylistMethods {
    private ArrayList<String> list;

    @BeforeSuite
    public void setUp(){
        list = new ArrayList<String>();
    }

    @Test(priority = 0)
    public void listwhenEmpty(){
        Assert.assertTrue(list.isEmpty());
        Assert.assertTrue(list.size()==0);
    }

    @Test(priority = 1)
    public void testadd(){
        String methodOutput=ArraylistMethods.add(list,"Priya");
        Assert.assertEquals(methodOutput,"Item added");
    }

    @Test(priority = 2)
    public void testaddNew(){
        String methodOutput=ArraylistMethods.add(list,"Marian");
        Assert.assertEquals(methodOutput,"Item added");
    }

    @Test(priority =4 )
    public void list(){
        ArrayList<String> expectedOutput=new ArrayList<String>(Arrays.asList("Priya","Marian"));
        ArrayList<String> methodOutput = ArraylistMethods.list(list);
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test (priority =5 )
    public void reverse(){
        ArrayList<String> expectedOutput=new ArrayList<String>(Arrays.asList("Marian","Priya"));
        ArrayList<String> methodOutput =ArraylistMethods.listReverse(list);
    }

    @Test
    public void searchInvalid(){
        String methodOutput=ArraylistMethods.search(list,"Lisa");
        Assert.assertEquals(methodOutput,"Lisa not present in the list");
    }

    @Test (priority = 3)
    public void  searchValid(){
        String methodOutput=ArraylistMethods.search(list,"Priya");
        Assert.assertEquals(methodOutput,"Priya is present in the list");
    }
}