package com.General.test;

import com.General.main.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Immutable class Account
 * @author Marisha
 *
 */
public class TestAccount {
    @Test
    public void createObjectAndGetName(){
        Account acc=new Account("Patrick",12);
        Assert.assertEquals(acc.getName(),"Patrick");
    }

    @Test
    public void createObjectAndGetAccno(){
        Account acc=new Account("Reshma",2);
        Assert.assertEquals(acc.getAccno(),2);
    }
}
