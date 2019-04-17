package com.oops.main;

/*
*Rectangle class extends Shape class and overrides all the methods
* of parent class.
*/
public class Rectangle extends Shape{
    public final double length,width;

     public Rectangle(double length,double width){
         this.length=length;
         this.width=width;
     }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*length*width;
    }
}



