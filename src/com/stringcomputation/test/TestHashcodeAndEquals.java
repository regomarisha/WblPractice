package com.stringcomputation.test;

import com.stringcomputation.main.HashcodeAndEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHashcodeAndEquals {
    @Test
    public void sameValues(){
        HashcodeAndEquals h1 = new HashcodeAndEquals(1,"Tom","Jerry");
        HashcodeAndEquals h2 = new HashcodeAndEquals(1,"Tom","Jerry");
        String methodOutput = HashcodeAndEquals.compare(h1,h2);
        Assert.assertEquals(methodOutput,"Both Objects are equal. ");
    }

    @Test
    public void sameTwoValues(){
        HashcodeAndEquals h1 = new HashcodeAndEquals(1,"Tom","Jerry");
        HashcodeAndEquals h2 = new HashcodeAndEquals(2,"Tom","Jerry");
        String methodOutput = HashcodeAndEquals.compare(h1,h2);
        Assert.assertEquals(methodOutput,"Both Objects are not equal. ");
    }
    @Test
    public void sameOneValue(){
        HashcodeAndEquals h1 = new HashcodeAndEquals(1,"Tom","Jerry");
        HashcodeAndEquals h2 = new HashcodeAndEquals(1,"Glen","Ds");
        String methodOutput = HashcodeAndEquals.compare(h1,h2);
        Assert.assertEquals(methodOutput,"Both Objects are not equal. ");    }

    @Test
    public void differentValues(){
        HashcodeAndEquals h1 = new HashcodeAndEquals(1,"Tom","Jerry");
        HashcodeAndEquals h2 = new HashcodeAndEquals(2,"Jim","Kerry");
        String methodOutput = HashcodeAndEquals.compare(h1,h2);
        Assert.assertEquals(methodOutput,"Both Objects are not equal. ");
    }
}
