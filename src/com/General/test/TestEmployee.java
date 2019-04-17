package com.General.test;

import com.General.main.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for to verify the
 *   order to execution of methods and block.
 * @author Marisha
 *
 */

public class TestEmployee {
    @Test
    public void accessStaticBlock() {
        //static block will be executed only when the Class is
        // loaded in JVM.
        Assert.assertEquals(Employee.bonus, 1000.0, "This is STATIC BLOCK.");
    }

    @Test
    public void creatInstance() {
        /**This is STATIC BLOCK.
           This is CONSTRUCTOR
         When class is loaded the static block is executed
         During object creation constructor is called
         Hence above two statemnts are printed
         */
        Employee e1 = new Employee("Kate", 12);
        Assert.assertNotNull(e1);

    }

    @Test
    public void accessStaticMethod(){
        //Static variables or methods can be invoked without having an instance of the class
        Assert.assertEquals(Employee.showMessage(),"STATIC METHOD","This is STATIC BLOCK.");
    }
}