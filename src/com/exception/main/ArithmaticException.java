package com.exception.main;

/*
*  	Program containing a function which is expected to
*  	throw any kind of com.exception say NullPointerException
*  	or ArithmeticException etc and then handle this function
*  	in the parent function which calls this function.
*/

public class ArithmaticException {
    private static int a,b;
    public ArithmaticException(int a,int b){
        this.a=a;
        this.b=b;
    }
    public  int divide(){
        return a/b;
    }

    public  String operation(){
        try{
            int c=divide();
            return "Result is "+c;

        }catch(ArithmeticException e){
            System.out.println("Denominator cannot be Zero");
            return "Exception";

        }

    }
}
