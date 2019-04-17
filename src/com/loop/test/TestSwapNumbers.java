package com.loop.test;

import com.loop.main.SwapNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing SwapNumbers class
 * @author Marisha
 *
 */

public class TestSwapNumbers {
   @Test
    public void testSwapPositive(){
       String actual = SwapNumbers.swap(2,4);
       Assert.assertEquals(actual,"4:2");
   }

   @Test
    public  void testSwapNegetive(){
       String actual = SwapNumbers.swap(-8,-10);
       Assert.assertEquals(actual,"-10:-8");
   }

    @Test
    public  void testSwapEqual(){
        String actual = SwapNumbers.swap(10,10);
        Assert.assertEquals(actual,"10:10");
    }

    @Test
    public void testSwapPositiveWithVariable(){
        String actual = SwapNumbers.swapWithVariable(4,2);
        Assert.assertEquals(actual,"2:4");
    }

    @Test
    public  void testSwapNegetiveWithVariable(){
        String actual = SwapNumbers.swapWithVariable(-8,-10);
        Assert.assertEquals(actual,"-10:-8");
    }

    @Test
    public  void testSwapEqualWithVariable(){
        String actual = SwapNumbers.swapWithVariable(10,10);
        Assert.assertEquals(actual,"10:10");
    }

}
