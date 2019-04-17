package com.polymorphism.main;

/*
*  		Program to depict the behavior of
*  		method overloading and overriding.
 */

public class Overloading {

    public String print(){
        return "In Overloading class";
    }
    public String  print(int a){
        return "One argument - "+a;
    }
    public String print(int a, int b) {
        return "Two arguments - " + a + " " + b;
    }
}
