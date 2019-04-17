package com.collections.test;

import com.collections.main.MonthOfYear;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing MonthOfYear class
 * @author Marisha
 *
 */
public class TestMonthOfYear {
    @Test
    public void testTotal(){
        int methodOutput= MonthOfYear.getTotalMonth();
        Assert.assertEquals(methodOutput,12);
    }

    @Test
    public void print(){
        String methodOutput=MonthOfYear.print();
        String expectedOutput="JANUARY FEBRUARY MARCH APRIL MAY JUNE JULY AUGUST SEPTEMBER OCTOBER NOVEMBER DECEMBER ";
        Assert.assertEquals(methodOutput,expectedOutput);
    }
}
