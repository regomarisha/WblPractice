package com.stringcomputation.test;

import com.stringcomputation.main.AppendIntegerToSTring;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for
 * testing AppendIntegerToSTring class
 * @author Marisha
 *
 */
public class TestAppendIntegerToSTring {
    @Test
    public void append()
    {
        String str="Hello wbl";
        String methodOutput= AppendIntegerToSTring.append(str);
        Assert.assertEquals(methodOutput,"Hello1 wbl2");
    }

    @Test
    public void appendToIntegers(){
        String str="123 453";
        String methodOutput= AppendIntegerToSTring.append(str);
        Assert.assertEquals(methodOutput,"1231 4532");
    }

    @Test
    public void appendtoSpCharacters(){
        String str="%%%*&^ &%$##";
        String methodOutput= AppendIntegerToSTring.append(str);
        Assert.assertEquals(methodOutput,"%%%*&^1 &%$##2");
    }

    @Test
    public void appendMultipleSpaces()
    {
        String str="Hello     wbl";
        String methodOutput= AppendIntegerToSTring.append(str);
        Assert.assertEquals(methodOutput,"Hello1     wbl2");
    }
}
