package com.exception.test;

import com.exception.main.ArithmaticException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing ArithmaticException class
 * @author Marisha
 *
 */
public class TestArithmaticException {
    @Test
    public void divideValid(){
        ArithmaticException ae=new ArithmaticException(6,2);
        Assert.assertEquals(ae.operation(),"Result is 3");
    }

    @Test
    public void divideByZero(){
        ArithmaticException ae=new ArithmaticException(6,0);
        Assert.assertEquals(ae.operation(),"Exception","Denominator cannot be Zero");
    }


}
