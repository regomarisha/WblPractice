package com.oops.main;

/*
*Program that creates a class Circle extending Shape abstract class
* and implementing ShapeConstants interface and has following behavior.
*  			--> Properties: radius.
* 			--> Constructor: To set number of sides.
*  			--> Overrides all the methods from parents.
*/
public class Circle extends Shape implements ShapeConstants
{
    double pi = ShapeConstants.pi;
    public final double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return pi*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }
}
