package com.collections.test;


import com.collections.main.SortMap;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * This class contains all the test cases for testing SortMap class
 * @author Marisha
 *
 */
public class TestSortMap {
    private Map<String, Integer> hmap = new HashMap<String, Integer>();
    private Map<String, Integer> posNeg = new HashMap<String, Integer>();
    private Map<String, Integer> rep = new HashMap<String, Integer>();

    @BeforeSuite
    public void setUp(){

        hmap.put("b", 70);
        hmap.put("a", 30);
        hmap.put("c", 10);
        hmap.put("d", 40);
        hmap.put("e", 20);
        posNeg.put("b",70);
        posNeg.put("d",-40);
        posNeg.put("a",30);
        rep.put("b",70);
        rep.put("d",70);
        rep.put("a",30);
    }

    @Test
    public void testAscending() {
        Map<String, Integer> methodOutput = SortMap.sortAscending(hmap);
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>()
        {{  put("c", 10);
            put("e", 20);
            put("a", 30);
            put("d",40);
            put("b",70);
        }};
        Assert.assertEquals(methodOutput,expectedOutput);
    }


    @Test
    public void testDescending() {
        Map<String, Integer> methodOutput = SortMap.sortAscending(hmap);
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>()
        {{  put("b",70);
            put("d",40);
            put("a", 30);
            put("e", 20);
            put("c", 10);
        }};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void testNegetivePositiveDescendiing(){
        Map<String, Integer> methodOutput = SortMap.sortDescending(posNeg);
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>()
        {{  put("b",70);
            put("a",30);
            put("d",-40);
        }};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void testNegetivePositiveAscendiing(){
        Map<String, Integer> methodOutput = SortMap.sortAscending(posNeg);
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>()
        {{  put("d",-40);
            put("a",30);
            put("b",70);
        }};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void testRepetedAscending(){
        Map<String, Integer> methodOutput = SortMap.sortAscending(rep);
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>()
        {{  put("a",30);
            put("b",70);
            put("d",70);
        }};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

    @Test
    public void testRepetedDescending(){
        Map<String, Integer> methodOutput = SortMap.sortDescending(rep);
        Map<String, Integer> expectedOutput = new HashMap<String, Integer>()
        {{  put("a",30);
            put("b",70);
            put("d",70);
        }};
        Assert.assertEquals(methodOutput,expectedOutput);
    }

}
