package com.oops.test;


import com.oops.main.Circle;
import com.oops.main.Rectangle;
import com.oops.main.Shape;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains all the test cases for testing Shape,Circle,Rectangle  class
 * @author Marisha
 *
 */
public class TestShape {
    @Test
    public void testAreaRectangle(){
        Shape sh=new Rectangle(2,3);
        Assert.assertEquals(sh.calculateArea(),6);
    }

    @Test
    public void testPerimeterRectangle(){
        Shape sh=new Rectangle(2,3);
        Assert.assertEquals(sh.calculatePerimeter(),12);
    }

    @Test
    public void testAreaCircle(){
        Shape sh=new Circle(2);
        Assert.assertEquals(sh.calculateArea(),12.56);
    }

    @Test
    public void testPerimeterCircle(){
        Shape sh=new Circle(2);
        Assert.assertEquals(sh.calculatePerimeter(),12.56);
    }

}
