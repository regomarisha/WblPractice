package com.General.test;

import com.General.main.AccessModifiers;
import com.General.main.AccessModifiersChild;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing AccessModifier Class
 * @author Marisha
 *
 */
public class TestAccessModifier {

    @Test
    public  void testDefault(){
        AccessModifiers ac=new AccessModifiers();
        Assert.assertEquals(ac.defaultFunction(),"Default");
    }

    @Test
    public void testProtected(){
        AccessModifiersChild acc=new AccessModifiersChild();
        Assert.assertEquals(acc.accessParentVariable(),"Protected");
    }

    @Test
    public  void testPublic(){
        AccessModifiers acpublic=new AccessModifiers();
        Assert.assertEquals(acpublic.publicVariable,"Public");
    }

  //Cannot write a test to test private function , because it is not accesible

}
