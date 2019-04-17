package com.collections.test;

import com.collections.main.HashMapMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains all the test cases for testing HashMapMethod class
 * @author Marisha
 *
 */

public class TestHashMapMethod {
    private HashMap<Integer,String> map;

    @Test(priority=0)
    public void createHashMap(){
        map=HashMapMethod.create();
        Assert.assertTrue(map.isEmpty());
        Assert.assertTrue(map.size()==0);
    }

    @Test(priority=1)
    public void add(){
        Map<Integer, String> expected = Map.of(
                1 , "Glen"
                     );
        map=HashMapMethod.add(map,1,"Glen");
        Assert.assertTrue(map.size()==1);
        Assert.assertEquals(map, expected,"Item added");
    }

    @Test(priority=2)
    public void addWithSameValue(){
        Map<Integer, String> expected = Map.of(
                1 , "Glen",
                2 , "Glen"
        );
        map=HashMapMethod.add(map,2,"Glen");
        Assert.assertTrue(map.size()==2);
        Assert.assertEquals(map, expected,"Item added");
    }

    @Test(priority=3)
    public void addWithSameKey() {
        Map<Integer, String> expected = Map.of(
                1, "Glen",
                2, "Mike"
        );
        map = HashMapMethod.add(map, 2, "Mike");
        Assert.assertTrue(map.size() == 2);
        Assert.assertEquals(map, expected, "Item added");
    }

    @Test(priority = 4)
    public void searchValid()
    {
        String methodOutput=HashMapMethod.search(map,1);
        Assert.assertEquals(methodOutput,"Glen");
    }

    @Test
    public void searchInvalid()
    {
        String methodOutput=HashMapMethod.search(map,9);
        Assert.assertEquals(methodOutput,"Key not found");
    }


}
