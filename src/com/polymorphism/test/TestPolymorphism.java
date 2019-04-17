package com.polymorphism.test;

import com.polymorphism.main.Overloading;
import com.polymorphism.main.Overriding;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for Overloading and Overriding
 * class which depicts polymorphism
 * @author Marisha
 */


public class TestPolymorphism {
    @Test
    public  void testOverloading(){
       Overloading ov=new Overloading();
       Assert.assertEquals(ov.print(),"In Overloading class");
    }

    @Test
    public  void testOverloadingOneArg(){
        Overloading ov=new Overloading();
        Assert.assertEquals(ov.print(2),"One argument - 2");
    }

    @Test
    public  void testOverloadingTwoArg(){
        Overloading ov=new Overloading();
        Assert.assertEquals(ov.print(1,2),"Two arguments - 1 2");
    }

    @Test
    public  void testOverriding(){
        Overriding or=new Overriding();
        Assert.assertEquals(or.print(),"Overriding the parent class");
    }



}
